package de.oth.othappserver.jobmarket

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.ObjectMapper
import de.oth.othappserver.model.JobQueryLocation
import de.oth.othappserver.tables.records.FacultyRecord

@JsonInclude(NON_NULL)
data class JobMarketRequest(val credentials: JobMarketCredentials, val calls: List<JobMarketCall>) {
    override fun toString(): String {
        return "JobMarketRequest(calls=$calls)"
    }
}
data class JobMarketCredentials(val id: String, val key: String)

sealed class JobMarketRequestResponse<T : JobMarketCall, R>(val call: T) {
    abstract fun parse(mapper: ObjectMapper, parser: JsonParser): R
}

class ObjectJobMarketRequestResponse<T : JobMarketCall, R>(call: T, private val responseType: Class<R>) : JobMarketRequestResponse<T, R>(call) {
    override fun parse(mapper: ObjectMapper, parser: JsonParser): R {
        return mapper.readValue(parser, responseType)
    }
}

class ListJobMarketRequestResponse<T : JobMarketCall, R>(call: T, private val responseType: Class<R>) : JobMarketRequestResponse<T, List<R>>(call) {
    override fun parse(mapper: ObjectMapper, parser: JsonParser): List<R> {
        val collectionType = mapper.typeFactory.constructCollectionLikeType(List::class.java, responseType)

        return mapper.readValue(parser, collectionType)
    }
}

class JobMarketRequests {
    companion object {
        fun jobOffer(id: Int) = ObjectJobMarketRequestResponse(JobOfferCall(id.toString()), JobMarketJobDetails::class.java)
        fun jobOffers(): ListJobMarketRequestResponse<JobOffersCall, JobMarketJob> = jobOffers(null, null, null, null, null, null, null)
        fun jobOffers(top: Int): ListJobMarketRequestResponse<JobOffersCall, JobMarketJob> = jobOffers(null, null, null, null, null, null, top)
        fun jobOffers(type: List<Int>?, faculty: FacultyRecord?, industry: List<Int>?, text: String?, locationFilter: JobQueryLocation?, country: String?, top: Int?): ListJobMarketRequestResponse<JobOffersCall, JobMarketJob> {
            val t = text?.split(" ")
            val location = if (locationFilter != null) "(${locationFilter.lat},${locationFilter.lng})" else null

            return ListJobMarketRequestResponse(
                JobOffersCall(type, faculty?.jobmarketId, industry, t, location, locationFilter?.radius?.toString(), country, top?.toString()),
                JobMarketJob::class.java
            )
        }

        fun industry() = ListJobMarketRequestResponse(IndustryCategoryCall(1), JobMarketIndustry::class.java)
        fun types() = ListJobMarketRequestResponse(JobTypesCall(), JobMarketJobType::class.java)
    }
}
