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
* 
* Values: HOERSAAL,CIP_POOL
*/
enum class RoomType(val value: kotlin.String) {

    @JsonProperty("Hoersaal") HOERSAAL("Hoersaal"),

    @JsonProperty("CIP Pool") CIP_POOL("CIP Pool");

}

