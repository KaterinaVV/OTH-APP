package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* The type of a calendar event.
* Values: DELETE,UPDATE,OCCURRENCE,EXCEPTION,SERIES_MASTER
*/
enum class EventType(val value: kotlin.String) {

    @JsonProperty("delete") DELETE("delete"),

    @JsonProperty("update") UPDATE("update"),

    @JsonProperty("occurrence") OCCURRENCE("occurrence"),

    @JsonProperty("exception") EXCEPTION("exception"),

    @JsonProperty("seriesMaster") SERIES_MASTER("seriesMaster");

}

