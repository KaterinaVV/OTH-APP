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
 * @param category 
 * @param message 
 * @param contactAddress 
 * @param images 
 * @param additionalInfo 
 */
data class FeedbackItem(

    @field:JsonProperty("category", required = true) val category: FeedbackItem.Category,

    @field:JsonProperty("message", required = true) val message: kotlin.String,

    @field:JsonProperty("contactAddress") val contactAddress: kotlin.String? = null,

    @get:Size(min=0,max=3) 
    @field:JsonProperty("images") val images: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("additionalInfo") val additionalInfo: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
) {

    /**
    * 
    * Values: BUG,FEEDBACK,IDEE
    */
    enum class Category(val value: kotlin.String) {
    
        @JsonProperty("Bug") BUG("Bug"),
    
        @JsonProperty("Feedback") FEEDBACK("Feedback"),
    
        @JsonProperty("Idee") IDEE("Idee");
    
    }

}
