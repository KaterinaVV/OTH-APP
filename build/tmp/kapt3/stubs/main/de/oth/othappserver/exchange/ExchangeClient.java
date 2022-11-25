package de.oth.othappserver.exchange;

import java.lang.System;

/**
 * A client interface for a server which communicates to a exchange server.
 *
 * The implementing class should be threadsafe.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lde/oth/othappserver/exchange/ExchangeClient;", "", "queryEvents", "Lde/oth/othappserver/exchange/ExchangeResult;", "startDateTime", "Ljava/time/ZonedDateTime;", "endDateTime", "deltaToken", "", "paged", "", "queryEventsPage", "skipToken", "sendFeedbackMail", "", "feedbackItem", "Lde/oth/othappserver/model/FeedbackItem;", "oth-app-server"})
public abstract interface ExchangeClient {
    
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
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.exchange.ExchangeResult queryEvents(@org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime endDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, boolean paged);
    
    /**
     * Retrieves a single page from exchange using a skipToken
     *
     * @param startDateTime The lower bound of the events range
     * @param endDateTime The upper bound of the events range
     * @param skipToken skipToken for reading the next page
     * @return A Container wrapping the pages event list and the next deltaToken/skipToken
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.exchange.ExchangeResult queryEventsPage(@org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime endDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String skipToken);
    
    /**
     * Sends a mail via the exchange REST API to the feedback recipient "oth-app@oth-regensburg.de".
     *
     * The format of the images strings must follow the base64 standard for embedding into images (See <a href="https://www.base64-image.de/">Base64 Image Encoder</a>).
     *
     * Example: <pre><code>
     *    data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJYAAACWBAMAAADOL2zRAAAAG1BMVEXMzMyWlpaqqqq3t7fFxcW+vr6xsbGjo6OcnJyLKnDGAAAACXBIWXMAAA7EAAAOxAGVKw4bAAABAElEQVRoge3SMW+DMBiE4YsxJqMJtHOTITPeOsLQnaodGImEUMZEkZhRUqn92f0MaTubtfeMh/QGHANEREREREREREREtIJJ0xbH299kp8l8FaGtLdTQ19HjofxZlJ0m1+eBKZcikd9PWtXC5DoDotRO04B9YOvFIXmXLy2jEbiqE6Df7DTleA5socLqvEFVxtJyrpZFWz/pHM2CVte0lS8g2eDe6prOyqPglhzROL+Xye4tmT4WvRcQ2/m81p+/rdguOi8Hc5L/8Qk4vhZzy08DduGt9eVQyP2qoTM1zi0/uf4hvBWf5c77e69Gf798y08L7j0RERERERERERH9P99ZpSVRivB/rgAAAABJRU5ErkJggg==
     * </pre></code>
     *
     * @param feedbackItem api model class containing all necessary data
     */
    public abstract void sendFeedbackMail(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.FeedbackItem feedbackItem);
}