package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A faculty's RSS Feed.
 * @param rss RSS feed URI
 * @param type Type of the RSS feed.
 */
data class Feed(

    @field:JsonProperty("rss", required = true) val rss: kotlin.String,

    @field:JsonProperty("type", required = true) val type: Feed.Type
) {

    /**
    * Type of the RSS feed.
    * Values: BULLETIN_BOARD
    */
    enum class Type(val value: kotlin.String) {
    
        @JsonProperty("BULLETIN_BOARD") BULLETIN_BOARD("BULLETIN_BOARD");
    
    }

}
