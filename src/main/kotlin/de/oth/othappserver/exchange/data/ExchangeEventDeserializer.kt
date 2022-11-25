package de.oth.othappserver.exchange.data

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.slf4j.LoggerFactory

/**
 * Deserializer for ExchangeEvents.
 *
 * First checks for a occurrence of a "Type" field. If a Type is given the event is mapped into
 * SingleInstanceEvent, SeriesOccurrenceEvent or SeriesMasterEvent.
 * If Type is not found it checks for a "Reason" field. If available this event is mapped into DeletedEvent.
 */
class ExchangeEventDeserializer : JsonDeserializer<List<ExchangeEvent>>() {

    companion object {
        const val FIELD_ID = "id"
        const val FIELD_SERIES_MASTER_ID = "seriesmasterid"
        const val FIELD_SUBJECT = "subject"
        const val FIELD_CATEGORIES = "categories"
        const val FIELD_START = "start"
        const val FIELD_END = "end"
        const val FIELD_IS_ALL_DAY = "isallday"
        const val FIELD_ORGANIZER = "organizer"
        const val FIELD_LOCATION = "location"
        const val FIELD_BODY = "body"
        const val FIELD_TYPE = "type"
        const val FIELD_REASON = "reason"
        const val FIELD_EMAIL_ADDRESS = "emailaddress"
        const val FIELD_ADDRESS = "address"
        const val FIELD_DISPLAY_NAME = "displayname"
        const val FIELD_CONTENT = "content"
        const val FIELD_DATE_TIME = "datetime"
    }

    private val logger = LoggerFactory.getLogger(ExchangeEventDeserializer::class.java)

    override fun deserialize(jp: JsonParser, ctxt: DeserializationContext?): List<ExchangeEvent> {
        val result = mutableListOf<ExchangeEvent>()

        while (jp.nextToken() !== JsonToken.END_ARRAY) {
            logger.debug("### Parsing new event. ###")
            try {
                val event = readEvent(jp)
                if (event != null) {
                    result += event
                }
                logger.debug("### Parsing event finished. ###")
            } catch (e: Exception) {
                logger.error("Could not parse event.", e)
            }
        }

        return result
    }

    /**
     * Reads a event from a JsonParser.
     *
     * After calling this method the application can call nextToken to point to the next available token, if any.
     *
     * @param jp JsonParser to read from
     */
    private fun readEvent(jp: JsonParser): ExchangeEvent? {
        val fields = mutableMapOf<String, Any>()

        while (jp.hasCurrentToken() && jp.nextToken() !== JsonToken.END_OBJECT) {
            if (jp.currentToken === JsonToken.FIELD_NAME) {
                val fieldName = jp.currentName.toLowerCase()

                jp.nextValue()

                when (fieldName) {
                    FIELD_ID -> fields[fieldName] = {
                        val id = jp.valueAsString
                        if (id.startsWith("CalendarView('")) {
                            id.substring("CalendarView('".length, id.length - "')".length)
                        } else {
                            id
                        }
                    }()
                    FIELD_SERIES_MASTER_ID -> if (jp.currentToken != JsonToken.VALUE_NULL) fields[fieldName] = jp.valueAsString
                    FIELD_SUBJECT -> fields[fieldName] = jp.valueAsString
                    FIELD_CATEGORIES -> {
                        val categories = mutableListOf<String>()
                        while (jp.nextToken() !== JsonToken.END_ARRAY) {
                            categories += jp.valueAsString
                        }
                        fields[fieldName] = categories
                    }
                    FIELD_START -> getExchangeDateTime(jp, fieldName, fields)
                    FIELD_END -> getExchangeDateTime(jp, fieldName, fields)
                    FIELD_IS_ALL_DAY -> fields[fieldName] = jp.valueAsBoolean
                    FIELD_ORGANIZER -> {
                        if (jp.currentToken === JsonToken.START_OBJECT) {
                            while (jp.nextToken() !== JsonToken.END_OBJECT) {
                                if (jp.currentName.equals(FIELD_EMAIL_ADDRESS, true)) {
                                    getChildStringValue(jp, FIELD_ADDRESS)?.let {
                                        fields[fieldName] = it
                                    }
                                }
                            }
                        }
                    }
                    FIELD_LOCATION -> {
                        getChildStringValue(jp, FIELD_DISPLAY_NAME)?.let {
                            fields[fieldName] = it
                        }
                    }
                    FIELD_BODY -> {
                        fields[fieldName] = readBody(jp)
                    }
                    FIELD_TYPE -> fields[fieldName] = jp.valueAsString
                    FIELD_REASON -> fields[fieldName] = jp.valueAsString
                    else -> {
                        logger.debug("$fieldName: skipping ")
                        jp.skipChildren()
                    }
                }

                if (logger.isDebugEnabled && fields.containsKey(fieldName)) {
                    logger.debug("$fieldName: ${fields[fieldName]}")
                }
            }
        }

        return createEvent(fields)
    }

    /**
     * Creates a event from a map of fields and values.
     *
     * The fields map has to contain the correct values (+type) for a given field.
     *
     * @param fields Fields for the event
     * @return A exchange event or null if no valid "Type" key is found in the fields map
     */
    private fun createEvent(fields: MutableMap<String, Any>): ExchangeEvent? {
        if (fields.containsKey(FIELD_REASON)) {
            return DeletedEvent(fields[FIELD_ID] as String)
        }

        return when (fields[FIELD_TYPE]) {
            "SingleInstance" -> createSingleInstance(fields)
            "Occurrence" -> createOccurrence(fields)
            "SeriesMaster" -> createMaster(fields)
            "Exception" -> createException(fields)
            else -> {
                logger.error("Unknown type ${fields[FIELD_TYPE]}")
                null
            }
        }
    }

    private fun createMaster(fields: MutableMap<String, Any>): ExchangeEvent {
        return SeriesMasterEvent(
            fields[FIELD_ID] as String,
            fields[FIELD_SUBJECT] as String,
            fields.getOrDefault(FIELD_CATEGORIES, null) as List<String>?,
            fields[FIELD_START] as String,
            fields[FIELD_END] as String,
            fields[FIELD_IS_ALL_DAY] as Boolean,
            fields.getOrDefault(FIELD_ORGANIZER, null) as String?,
            fields.getOrDefault(FIELD_LOCATION, null) as String?,
            fields.getOrDefault(FIELD_BODY, null) as Body?
        )
    }

    private fun createException(fields: MutableMap<String, Any>): ExchangeEvent {
        return SeriesExceptionEvent(
            fields[FIELD_ID] as String,
            fields[FIELD_SERIES_MASTER_ID] as String,
            fields[FIELD_SUBJECT] as String,
            fields.getOrDefault(FIELD_CATEGORIES, null) as List<String>?,
            fields[FIELD_START] as String,
            fields[FIELD_END] as String,
            fields[FIELD_IS_ALL_DAY] as Boolean,
            fields.getOrDefault(FIELD_ORGANIZER, null) as String?,
            fields.getOrDefault(FIELD_LOCATION, null) as String?,
            fields.getOrDefault(FIELD_BODY, null) as Body?
        )
    }

    private fun createOccurrence(fields: MutableMap<String, Any>): ExchangeEvent {
        return SeriesOccurrenceEvent(
            fields[FIELD_ID] as String,
            fields[FIELD_SERIES_MASTER_ID] as String,
            fields[FIELD_START] as String,
            fields[FIELD_END] as String
        )
    }

    private fun createSingleInstance(fields: MutableMap<String, Any>): ExchangeEvent {
        return SingleInstanceEvent(
            fields[FIELD_ID] as String,
            fields[FIELD_SUBJECT] as String,
            fields.getOrDefault(FIELD_CATEGORIES, null) as List<String>?,
            fields[FIELD_START] as String,
            fields[FIELD_END] as String,
            fields[FIELD_IS_ALL_DAY] as Boolean,
            fields.getOrDefault(FIELD_ORGANIZER, null) as String?,
            fields.getOrDefault(FIELD_LOCATION, null) as String?,
            fields.getOrDefault(FIELD_BODY, null) as Body?
        )
    }

    /**
     * Retrieves a datatime from the JsonParser stream and puts it into the fields map.
     *
     * @param jp JsonParser to read from
     * @param fieldkey lowerCase Name of the key used for the fields map
     * @param fields Fields for the event
     */
    private fun getExchangeDateTime(jp: JsonParser, fieldkey: String, fields: MutableMap<String, Any>) {
        getChildStringValue(jp, FIELD_DATE_TIME)?.let {
            fields[fieldkey] = it
        }
    }

    /**
     * Retrieves a single value from a object token.
     *
     * After the value has been read the stream skips to the end of the object.
     *
     * @param jp JsonParser to read from
     * @param field lowerCase Name of the field to search for
     */
    private fun getChildStringValue(jp: JsonParser, field: String): String? {
        var result: String? = null
        while (jp.nextToken() !== JsonToken.END_OBJECT) {
            jp.nextValue()
            if (jp.currentName.equals(field, true)) {
                if (jp.currentToken != JsonToken.VALUE_STRING) {
                    logger.error("Expected string token for field $field.")
                } else {
                    result = jp.valueAsString
                }
            } else {
                jp.skipChildren()
            }
        }

        return result
    }

    private fun readBody(jp: JsonParser): Body {
        var content = ""
        var type = ""
        while (jp.nextToken() !== JsonToken.END_OBJECT) {
            jp.nextValue()
            when {
                jp.currentName.equals("Content", true) -> content = jp.valueAsString
                jp.currentName.equals("ContentType", true) -> type = jp.valueAsString
                else -> jp.skipChildren()
            }
        }

        return Body(content, Body.TYPE.valueOf(type))
    }
}
