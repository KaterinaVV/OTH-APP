package de.oth.othappserver.service.tags

import de.oth.othappserver.exchange.EventData
import de.oth.othappserver.exchange.data.Body
import org.jsoup.Jsoup
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

/**
 * Parses the body of a EventData for hashtags and reads them.
 *
 * A tag is additional metadata attached to a event. It looks like this: #value;
 *
 * Example:
 * #some@email.de
 *
 * A tag is defined like this:
 * 1. Starts with a hashtag.
 * 2. Is the very first line in an events content.
 * 2.1 This is either the first element containing an '#' matching the Regex in a HTML body
 * 2.2 or the first line in plaintext data
 * 3. Always ends with the end of the first line.
 */
@Component
class EventTagsParser {

    companion object {
        private val regex = Regex("#(.+)")
        // "pattern" defines the objects in search pattern
        private val logger: Logger = LoggerFactory.getLogger(EventTagsParser::class.java)
    }

    data class ExtractTagResult(val tag: Optional<String>, val data: String?)

    /**
     * Search for tags in the body of a event.
     *
     * @return Optional containing the tag as String
     */
    fun extractTag(data: EventData): ExtractTagResult {
        if (data.body == null) {
            return ExtractTagResult(Optional.empty(), null)
        }
        val content = data.body.content

        return when (data.body.type) {
            Body.TYPE.HTML -> fromHTML(content)
            Body.TYPE.TEXT -> fromText(content)
        }
    }

    private fun fromText(content: String): ExtractTagResult {
        val sequence = content.lineSequence()
        val firstLine = sequence.firstOrNull() ?: return ExtractTagResult(Optional.empty(), content)
        val matchResult = regex.find(firstLine)
        // "find" method scan input in order to find next matched subsequence

        return when (val tag = matchResult?.groups?.get(1)?.value) {
            null -> ExtractTagResult(Optional.empty(), content)
            else -> {
                if (logger.isDebugEnabled) {
                    logger.debug("Found tag $tag")
                }
                val data = sequence
                    .drop(1)
                    .joinToString("\n")
                ExtractTagResult(Optional.of(tag), data)
            }
        }
    }

    private fun fromHTML(content: String): ExtractTagResult {
        val document = Jsoup.parse(content)
        val (el, match) = document.body()
            .getElementsContainingOwnText("#")
            .map { Pair(it, regex.find(it.wholeText())) }
            .firstOrNull { it.second != null } ?: return ExtractTagResult(Optional.empty(), content)

        return when (val tag = match?.groups?.get(1)?.value) {
            null -> ExtractTagResult(Optional.empty(), content)
            else -> {
                if (logger.isDebugEnabled) {
                    logger.debug("Found tag $tag")
                }
                el.remove()
                ExtractTagResult(Optional.of(tag), document.html())
            }
        }
    }
}
