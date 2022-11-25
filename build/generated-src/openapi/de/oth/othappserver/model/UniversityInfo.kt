package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Holiday
import de.oth.othappserver.model.UniversityInfoRoomFinderFilter
import de.oth.othappserver.model.UniversityInfoSemesterPeriods
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
 * @param holidays A list of available holidays.
 * @param semesterPeriods A list of available semester periods.
 * @param roomFinderFilter 
 */
data class UniversityInfo(

    @field:Valid
    @get:Size(min=0)
    @field:JsonProperty("holidays", required = true) val holidays: kotlin.collections.List<Holiday>,

    @field:Valid
    @get:Size(min=0)
    @field:JsonProperty("semesterPeriods", required = true) val semesterPeriods: kotlin.collections.List<UniversityInfoSemesterPeriods>,

    @field:Valid
    @field:JsonProperty("roomFinderFilter", required = true) val roomFinderFilter: UniversityInfoRoomFinderFilter
) {

}
