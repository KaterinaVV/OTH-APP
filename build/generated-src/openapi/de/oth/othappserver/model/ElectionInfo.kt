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
 * @param electionStart Date of the start of the election.
 * @param electionEnd Date of the end of the election.
 * @param startShowElectionInfo Date when to show the election info in the app.
 * @param endShowElectionInfo Date when to stop showing the election info.
 * @param howToVoteShort Short description of how to vote.
 * @param howToVoteLong Detailed description of how to vote.
 * @param whatToVoteSenat Description of voting for the senate.
 * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
 * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
 */
data class ElectionInfo(

    @field:Valid
    @field:JsonProperty("electionStart", required = true) val electionStart: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("electionEnd", required = true) val electionEnd: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("startShowElectionInfo", required = true) val startShowElectionInfo: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("endShowElectionInfo", required = true) val endShowElectionInfo: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("howToVoteShort") val howToVoteShort: kotlin.Any? = null,

    @field:Valid
    @field:JsonProperty("howToVoteLong") val howToVoteLong: kotlin.Any? = null,

    @field:Valid
    @field:JsonProperty("whatToVoteSenat") val whatToVoteSenat: kotlin.Any? = null,

    @field:Valid
    @field:JsonProperty("whatToVoteKonvent") val whatToVoteKonvent: kotlin.Any? = null,

    @field:Valid
    @field:JsonProperty("whatToVoteFaculty") val whatToVoteFaculty: kotlin.Any? = null
) {

}
