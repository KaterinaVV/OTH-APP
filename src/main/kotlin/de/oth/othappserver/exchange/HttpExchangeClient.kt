package de.oth.othappserver.exchange

import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import de.oth.othappserver.exceptions.InvalidSyncTokenProblem
import de.oth.othappserver.exchange.data.*
import de.oth.othappserver.extension.is2xxSuccessful
import de.oth.othappserver.model.FeedbackItem
import org.apache.http.HttpResponse
import org.apache.http.HttpStatus
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.protocol.HttpClientContext
import org.apache.http.entity.StringEntity
import org.apache.http.util.EntityUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.unbescape.html.HtmlEscape
import org.zalando.problem.Problem
import org.zalando.problem.Status
import org.zalando.problem.Status.GATEWAY_TIMEOUT
import org.zalando.problem.Status.INTERNAL_SERVER_ERROR
import java.io.IOException
import java.net.URLEncoder
import java.time.ZonedDateTime
import java.util.stream.Stream
import kotlin.streams.toList

class HttpExchangeClient(
    private val client: HttpClient,
    val contextSupplier: () -> HttpClientContext,
    private val calendarURI: String,
    private val mailURI: String,
    private val mapper: ObjectMapper,
    private val exchangeProperties: ExchangeProperties
) : ExchangeClient {
    // object is delay-loaded, initialized only after the first call
    // companion object is initialized when its superclass is loaded. Same to static in Java
    companion object {
        private const val DELTA_TOKEN_LITERAL = "deltatoken="
        private const val SKIP_TOKEN_LITERAL = "skiptoken="
        private val logger: Logger = LoggerFactory.getLogger(HttpExchangeClient::class.java)
    }

    override fun queryEvents(
        startDateTime: ZonedDateTime,
        endDateTime: ZonedDateTime,
        deltaToken: String?,
        paged: Boolean
    ): ExchangeResult {
        if (paged) {
            logger.debug("Paginated exchange request.")
        }

        val request = createRequest(startDateTime, endDateTime, deltaToken, null, exchangeProperties.pageSize)
        var page = executeRequest(request)

        val events = page.events.toMutableList()
        logger.debug("Adding ${page.events.size} events to result set.")

        var pageCount = 1
        do {
            logger.debug("Requesting $pageCount. page of events using deltaToken=${page.deltaToken} && skipToken=${page.skipToken}.")
            val pageRequest =
                createRequest(startDateTime, endDateTime, page.deltaToken, page.skipToken, exchangeProperties.pageSize)
            page = executeRequest(pageRequest)

            logger.debug("Adding ${page.events.size} events to result set.")
            events.addAll(page.events)
            pageCount++
        } while (page.deltaToken == null && !paged)

        return ExchangeResult(events, page.deltaToken, page.skipToken)
    }

    override fun queryEventsPage(
        startDateTime: ZonedDateTime,
        endDateTime: ZonedDateTime,
        skipToken: String
    ): ExchangeResult {
        val request = createRequest(startDateTime, endDateTime, null, skipToken, exchangeProperties.pageSize)

        return executeRequest(request)
    }

    /**
     * https://docs.microsoft.com/en-us/previous-versions/office/office-365-api/api/version-2.0/mail-rest-operations#SendMessages
     */
    override fun sendFeedbackMail(
        feedbackItem: FeedbackItem
    ) {
        var attachmentsJson = ""
        var attachmentsHtml = ""
        if (feedbackItem.images != null && feedbackItem.images.isNotEmpty()) {
            attachmentsJson = ", \"Attachments\": [" + feedbackItem.images.mapIndexed { index, base64Image ->
                val fileEnding = when {
                    base64Image.startsWith("data:image/") ->
                        base64Image.substring("data:image/".length, base64Image.indexOf(';'))
                    else -> "unknownImageType"
                }
                return@mapIndexed """
                  {
                    "@odata.type": "#Microsoft.OutlookServices.FileAttachment",
                    "Name": "image$index.$fileEnding",
                    "IsInline": true,
                    "ContentId": "image$index",
                    "ContentType": "image/$fileEnding",
                    "ContentLocation": null,
                    "ContentBytes": "${base64Image.substringAfterLast(',')}"
                  }
                """.trimIndent()
            }.joinToString(",\n") + "]"

            attachmentsHtml = "<br><b>Bilder:</b><br>" + feedbackItem.images.mapIndexed { index, _ ->
                "<img alt=\"\" src=\"cid:${"image$index"}\">"
            }.joinToString("<br>")
        }

        val htmlMessage =
            """
            <html>
            <head>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
            <meta content="text/html; charset=utf-8">
            </head>
            <body bgcolor="#FFFFFF">
            <font face="Calibri">
            <b>Nachricht:</b><br>
            <pre>${HtmlEscape.escapeHtml4(feedbackItem.message)}</pre>
            <b>Kontaktadresse: </b>${HtmlEscape.escapeHtml4(feedbackItem.contactAddress) ?: "keine Angabe"} 
            <b>Zusaetzliche Informationen: </b>${HtmlEscape.escapeHtml4(feedbackItem.additionalInfo.toString()) ?: "keine Angabe"} 
            $attachmentsHtml
            </font>
            </body>
            </html>
            """.trimIndent().replace("\"", "\\\"")
        val post = HttpPost(mailURI)
        val postAsString =
            """
            {
              "Message": {
                "Subject": "[OthApp] ${feedbackItem.category.value}",
                "Body": {
                  "ContentType": "html",
                  "Content": "$htmlMessage"
                },
                "ToRecipients": [
                  {
                    "EmailAddress": {
                      "Address": "${exchangeProperties.feedbackMailAddress}"
                    }
                  }
                ]$attachmentsJson
              },
              "SaveToSentItems": "false"
            }
            """.trimIndent()
        post.entity = StringEntity(postAsString)
        post.setHeader("Accept", "application/json")
        post.setHeader("Content-type", "application/json")
        try {
            client.execute(post, contextSupplier()).let { response ->
                if (!response.is2xxSuccessful()) {
                    logger.error("Feedback mail could not be send. Exchange returned ${response.statusLine.statusCode} ${response.statusLine.reasonPhrase}.")

                    // Close the opened connection before throwing an error
                    EntityUtils.consumeQuietly(response.entity)

                    throw Problem.valueOf(Status.valueOf(response.statusLine.statusCode), response.statusLine.reasonPhrase)
                }
                // Close the connection - the response had a 2xx status code
                // Nothing else is needed to send the feedback mail
                EntityUtils.consumeQuietly(response.entity)
            }
        } catch (e: Exception) {
            when (e) {
                is IOException -> throw Problem.valueOf(GATEWAY_TIMEOUT)
                else -> throw Problem.valueOf(INTERNAL_SERVER_ERROR)
            }
        }
    }

    private fun executeRequest(request: HttpGet): ExchangeResult {
        return runCatching {
            client.execute(request, contextSupplier())
        }.getOrElse {
            logger.error("Failed to get exchange events.", it)

            when (it) {
                is IOException -> throw Problem.valueOf(GATEWAY_TIMEOUT)
                else -> throw Problem.valueOf(INTERNAL_SERVER_ERROR)
            }
        }.let {
            readResponse(it)
        }.let {
            getExchangeResult(it)
        }
    }

    /**
     * Reads the JSON value of the content of a response
     *
     * The response entity will be closed afterwards.
     */
    private fun readResponse(response: HttpResponse): ExchangeContainer {
        if (response.statusLine.statusCode != HttpStatus.SC_OK) {
            response.entity.content.use {
                val json = it.bufferedReader().use { it.readText() }
                logger.error("Exchange request returned ${response.statusLine}. $json")

                try {
                    val failure = mapper.readValue<ExchangeFailure>(json)

                    when (failure.error.code) {
                        ExchangeErrorCode.SyncStateNotFound -> throw InvalidSyncTokenProblem()
                        else -> throw Problem.valueOf(INTERNAL_SERVER_ERROR)
                    }
                } catch (e: JsonMappingException) {
                    logger.error("Failed to parser exchange error.", e)

                    throw Problem.valueOf(INTERNAL_SERVER_ERROR)
                }
            }
        }

        return response.entity.content.use {
            if (logger.isDebugEnabled) {
                val json = it.bufferedReader().use { it.readText() }

                logger.debug("Exchange response: $json")

                mapper.readValue(json)
            } else {
                mapper.readValue(it)
            }
        }
    }

    private fun getExchangeResult(exchangeContainer: ExchangeContainer): ExchangeResult {
        val events = mapToIExchangeEvents(exchangeContainer.events)

        if (exchangeContainer.deltaLink != null) {
            val startIndex = exchangeContainer.deltaLink.toLowerCase().indexOf(DELTA_TOKEN_LITERAL)
            val nextDeltaToken = exchangeContainer.deltaLink.substring(startIndex + DELTA_TOKEN_LITERAL.length)

            return ExchangeResult(events, nextDeltaToken, null)
        }

        if (exchangeContainer.nextLink != null) {
            val startIndex = exchangeContainer.nextLink.toLowerCase().indexOf(SKIP_TOKEN_LITERAL)
            val nextSkipToken = exchangeContainer.nextLink.substring(startIndex + SKIP_TOKEN_LITERAL.length)

            return ExchangeResult(events, null, nextSkipToken)
        }

        return ExchangeResult(events, null, null)
    }

    private fun mapToIExchangeEvents(origEvents: Collection<ExchangeEvent>): List<IExchangeEvent> {
        val seriesMasters = origEvents
            .filterIsInstance<SeriesMasterEvent>()
            .associateBy { it.id }

        return origEvents.stream()
            .map { event ->
                when (event) {
                    is SingleInstanceEvent -> event.toExchangeEvent()
                    is DeletedEvent -> event.toExchangeEvent()
                    is SeriesMasterEvent -> event.toExchangeEvent()
                    is SeriesExceptionEvent -> event.toExchangeEvent()
                    is SeriesOccurrenceEvent -> {
                        val master = seriesMasters[event.seriesMasterId]
                        if (master == null) {
                            logger.error("Could not find seriesmaster ${event.seriesMasterId}.")
                            throw Problem.valueOf(INTERNAL_SERVER_ERROR)
                        } else {
                            event.toExchangeEvent(master)
                        }
                    }
                    else -> null
                }
            }
            .filterNull()
            .toList()
    }

    @Suppress("UNCHECKED_CAST")
    private fun <T> Stream<T?>.filterNull(): Stream<T> {
        return filter { it != null } as Stream<T>
    }

    private fun createRequest(
        startDateTime: ZonedDateTime,
        endDateTime: ZonedDateTime,
        deltaToken: String?,
        skipToken: String?,
        pageSize: Int?
    ): HttpGet {
        val startDateTimeString = URLEncoder.encode(startDateTime.toOffsetDateTime().toString(), "utf-8")
        val endDateTimeString = URLEncoder.encode(endDateTime.toOffsetDateTime().toString(), "utf-8")

        var uri = "$calendarURI?startDateTime=$startDateTimeString&endDateTime=$endDateTimeString"
        if (deltaToken != null) uri += "&\$$DELTA_TOKEN_LITERAL$deltaToken"
        if (skipToken != null) uri += "&\$$SKIP_TOKEN_LITERAL$skipToken"

        val get = HttpGet(uri)
        // Add Header to get a deltaLink
        get.addHeader("Prefer", "odata.track-changes")

        // Activate Paging
        if (pageSize != null) {
            get.addHeader("Prefer", "odata.maxpagesize=$pageSize")
        }

        // Setting the timezone to Europe/Berlin
        get.addHeader("Prefer", "outlook.timezone=\"W. Europe Standard Time\"")
        return get
    }
}
