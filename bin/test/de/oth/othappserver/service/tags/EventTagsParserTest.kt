package de.oth.othappserver.service.tags

import de.oth.othappserver.exchange.EventData
import de.oth.othappserver.exchange.data.Body
import org.jsoup.Jsoup
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Unit Test for EventTagsParser.
 */
internal class EventTagsParserTest {

    /**
     * Tests the basic functionality for finding a tag in an events body.
     */
    @Test
    fun findTag_simpleValue_found() {
        val parser = EventTagsParser()
        val value = "Test"
        val body =
            """
            <html>
                <body>
                    <p>#$value</p>
                    <p>This is content.</p>
                </body>
            </html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertTrue(extractTagResult.tag.isPresent)
        assertEquals(value, extractTagResult.tag.get())

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 1)
        assertEquals("This is content.", pTags.text())
    }

    /**
     * Tests that only tags in the first body line are used.
     */
    @Test
    fun findTag_usesFirstLineValues_found() {
        val parser = EventTagsParser()
        val value = "Test"
        val body =
            """
            <html>
                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
                    <style type="text/css" style="display:none">#somestyles</style>
                </head>
                <body>
                    <p>#$value</p>
                    <p>#This is content.</p>                
                </body>
            </html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertTrue(extractTagResult.tag.isPresent)
        assertEquals(extractTagResult.tag.get(), value)

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 1)
        assertEquals("#This is content.", pTags.text())
    }

    /**
     * Tests that tags with multiple words can be found.
     */
    @Test
    fun findTag_multipleWords_found() {
        val parser = EventTagsParser()
        val value = "Test Test"
        val body =
            """
            <html>
                <body>
                    <p>#$value</p>
                    <p>This is content.</p>
                </body>
            </html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertTrue(extractTagResult.tag.isPresent)
        assertEquals(extractTagResult.tag.get(), value)

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 1)
        assertEquals("This is content.", pTags.text())
    }

    /**
     * Tests that tags annotated by inline XML elements can be found.
     */
    @Test
    fun findTag_classAnnotated_found() {
        val parser = EventTagsParser()
        val value = "Test"
        val body =
            """
            <html>
                <body>
                    <p>#<span class="some">$value</span></p>
                    <p>This is content.</p>
                </body>
            </html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertTrue(extractTagResult.tag.isPresent)
        assertEquals(extractTagResult.tag.get(), value)

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 1)
        assertEquals("This is content.", pTags.text())
    }

    /**
     * Tests that data without tags can be handled.
     */
    @Test
    fun findTag_noTags_notFound() {
        val parser = EventTagsParser()
        val body =
            """
            <html>
                <body>
                    <p>This is content.</p>
                </body>
            </html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertFalse(extractTagResult.tag.isPresent)

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 1)
        assertEquals("This is content.", pTags.text())
    }

    /**
     * Tests that empty data can be handled.
     */
    @Test
    fun findTag_noContent_notFound() {
        val parser = EventTagsParser()
        val body =
            """
            <html><body></body></html>
            """.trimIndent()
        val extractTagResult = parser.extractTag(htmlEventData(body))

        assertFalse(extractTagResult.tag.isPresent)

        val pTags = Jsoup.parse(extractTagResult.data).getElementsByTag("p")
        assertTrue(pTags.size == 0)
    }

    /**
     * Tests that plain text data can be handled.
     */
    @Test
    fun findTag_plainText_found() {
        val parser = EventTagsParser()
        val value = "Test"
        val body =
            """
            #$value
            This is content.
            """.trimIndent()
        val extractTagResult = parser.extractTag(textEventData(body))

        assertTrue(extractTagResult.tag.isPresent)
        assertEquals(value, extractTagResult.tag.get())
        assertEquals("This is content.", extractTagResult.data?.trim())
    }

    private fun htmlEventData(body: String) =
        EventData("1", "", emptyList(), "", "", false, "", "", Body.fromHtml(body))

    private fun textEventData(body: String) =
        EventData("1", "", emptyList(), "", "", false, "", "", Body.fromText(body))
}
