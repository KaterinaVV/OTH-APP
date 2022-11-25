package de.oth.othappserver.jobmarket

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "call", visible = true)
@JsonSubTypes(
    JsonSubTypes.Type(value = JobOffersCall::class, name = "joboffers"),
    JsonSubTypes.Type(value = JobOfferCall::class, name = "joboffer"),
    JsonSubTypes.Type(value = IndustryCategoryCall::class, name = "KT"),
    JsonSubTypes.Type(value = JobTypesCall::class, name = "types")
)
sealed class JobMarketCall(val call: String)

data class JobOfferCall(val id: String) : JobMarketCall("joboffer") {
    override fun toString(): String {
        return "JobOfferCall(id='$id')"
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class JobOffersCall(
    @JsonProperty("type") val type: List<Int>?,
    @JsonProperty("FB_ID") val faculty: Int?,
    @JsonProperty("KT_1") val industry: List<Int>?,
    @JsonProperty("Volltext") val text: List<String>?,
    @JsonProperty("Arbeitsort") val location: String?,
    @JsonProperty("Radius") val radius: String?,
    @JsonProperty("Land") val country: String?,
    @JsonProperty("top") val top: String?
) : JobMarketCall("joboffers") {
    override fun toString(): String {
        return "JobOffersCall(type=$type, faculty=$faculty, industry=$industry, text=$text, location=$location, radius=$radius, country=$country, top=$top)"
    }
}

data class IndustryCategoryCall(val id: Int, val lang: String = "de") : JobMarketCall("KT") {
    override fun toString(): String {
        return "IndustryCategoryCall(id=$id, lang='$lang')"
    }
}

class JobTypesCall : JobMarketCall("types") {
    override fun toString(): String {
        return "JobTypesCall()"
    }
}
