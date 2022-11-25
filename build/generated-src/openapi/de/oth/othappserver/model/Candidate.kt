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
 * 
 * @param firstName First name of the candidate.
 * @param lastName Last name of the candidate.
 * @param course Course of studies the candidate applied to.
 * @param term The term the candidate is currently graduating.
 * @param offices A list of offices the candidate is running for.
 * @param goals The goals the candidate wants to achieve during his/her time in office.
 * @param faculty The faculty of the candidate and his course.
 * @param id Identification number of the candidate
 * @param motto The motto of the candidate.
 */
data class Candidate(

    @field:JsonProperty("firstName", required = true) val firstName: kotlin.String,

    @field:JsonProperty("lastName", required = true) val lastName: kotlin.String,

    @field:JsonProperty("course", required = true) val course: kotlin.String,

    @field:JsonProperty("term", required = true) val term: kotlin.Int,

    @get:Size(min=1)
    @field:JsonProperty("offices", required = true) val offices: kotlin.collections.List<Candidate.Offices>,

    @field:JsonProperty("goals", required = true) val goals: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("faculty", required = true) val faculty: Candidate.Faculty,

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("motto") val motto: kotlin.String? = null
) {

    /**
    * A list of offices the candidate is running for.
    * Values: STUDENTISCHER_KONVENT,SENAT,FAKULTAETSRAT
    */
    enum class Offices(val value: kotlin.String) {
    
        @JsonProperty("Studentischer Konvent") STUDENTISCHER_KONVENT("Studentischer Konvent"),
    
        @JsonProperty("Senat") SENAT("Senat"),
    
        @JsonProperty("Fakultaetsrat") FAKULTAETSRAT("Fakultaetsrat");
    
    }

    /**
    * The faculty of the candidate and his course.
    * Values: ANK,ARC,ASG,BAU,BW,EI,IM,MB
    */
    enum class Faculty(val value: kotlin.String) {
    
        @JsonProperty("ANK") ANK("ANK"),
    
        @JsonProperty("ARC") ARC("ARC"),
    
        @JsonProperty("ASG") ASG("ASG"),
    
        @JsonProperty("BAU") BAU("BAU"),
    
        @JsonProperty("BW") BW("BW"),
    
        @JsonProperty("EI") EI("EI"),
    
        @JsonProperty("IM") IM("IM"),
    
        @JsonProperty("MB") MB("MB");
    
    }

}
