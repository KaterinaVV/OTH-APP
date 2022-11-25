package de.oth.othappserver.exchange

import de.oth.othappserver.model.FeedbackItem
import java.time.ZonedDateTime

/**
 * A client interface for a server which communicates to a exchange server.
 *
 * The implementing class should be threadsafe.
 */
interface ExchangeClient {
    /**
     * Retrieves events from a exchange calendar.
     *
     * The deltaToken can be received after a initial call to this method
     * *without* supplying a deltaToken.
     *
     * @param startDateTime The lower bound of the events range
     * @param endDateTime The upper bound of the events range
     * @param deltaToken A optional deltaToken to use
     * @return A Container wrapping an events list and the next deltaToken/skipToken
     */
    fun queryEvents(startDateTime: ZonedDateTime, endDateTime: ZonedDateTime, deltaToken: String?, paged: Boolean): ExchangeResult

    /**
     * Retrieves a single page from exchange using a skipToken
     *
     * @param startDateTime The lower bound of the events range
     * @param endDateTime The upper bound of the events range
     * @param skipToken skipToken for reading the next page
     * @return A Container wrapping the pages event list and the next deltaToken/skipToken
     */
    fun queryEventsPage(startDateTime: ZonedDateTime, endDateTime: ZonedDateTime, skipToken: String): ExchangeResult

    /**
     * Sends a mail via the exchange REST API to the feedback recipient "oth-app@oth-regensburg.de".
     *
     * The format of the images strings must follow the base64 standard for embedding into images (See <a href="https://www.base64-image.de/">Base64 Image Encoder</a>).
     *
     * Example: <pre><code>
     *     data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJYAAACWBAMAAADOL2zRAAAAG1BMVEXMzMyWlpaqqqq3t7fFxcW+vr6xsbGjo6OcnJyLKnDGAAAACXBIWXMAAA7EAAAOxAGVKw4bAAABAElEQVRoge3SMW+DMBiE4YsxJqMJtHOTITPeOsLQnaodGImEUMZEkZhRUqn92f0MaTubtfeMh/QGHANEREREREREREREtIJJ0xbH299kp8l8FaGtLdTQ19HjofxZlJ0m1+eBKZcikd9PWtXC5DoDotRO04B9YOvFIXmXLy2jEbiqE6Df7DTleA5socLqvEFVxtJyrpZFWz/pHM2CVte0lS8g2eDe6prOyqPglhzROL+Xye4tmT4WvRcQ2/m81p+/rdguOi8Hc5L/8Qk4vhZzy08DduGt9eVQyP2qoTM1zi0/uf4hvBWf5c77e69Gf798y08L7j0RERERERERERH9P99ZpSVRivB/rgAAAABJRU5ErkJggg==
     * </pre></code>
     *
     * @param feedbackItem api model class containing all necessary data
     */
    fun sendFeedbackMail(feedbackItem: FeedbackItem)
}
