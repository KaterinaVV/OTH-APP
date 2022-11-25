package de.oth.othappserver.jobmarket

import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Industry
import de.oth.othappserver.model.Job
import de.oth.othappserver.model.JobDetails
import de.oth.othappserver.model.JobType
import de.oth.othappserver.tables.records.FacultyRecord
import java.time.LocalDate
import java.time.format.DateTimeFormatter

const val JOB_PDF_URL_BASE = "https://jobboerse.oth-regensburg.de/index.php/PDF/"

sealed class JobMarketEntity

private val DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")

class JobMarketJob(
    @JsonProperty("Job_ID") val id: String,
    @JsonProperty("Aktualitaetsdatum") val date: String,
    @JsonProperty("Angebotstitel") val title: String,
    @JsonProperty("logoURL") val logo: String,
    @JsonProperty("url") val url: String,
    @JsonProperty("Prs_Firma") val company: String?,
    @JsonProperty("Arbeitsort_lat") val lat: String?,
    @JsonProperty("Arbeitsort_lng") val lng: String?,
    @JsonProperty("country") val country: String?
) : JobMarketEntity() {
    fun toModel(): Job = Job(id.toInt(), title, logo, JOB_PDF_URL_BASE + id.toInt(), url, company, lat, lng, country, LocalDate.parse(date, DATE_FORMAT))
}

class JobMarketJobDetails(
    @JsonProperty("Job_ID") val id: String,
    @JsonProperty("Aktualitaetsdatum") val date: String,
    @JsonProperty("Angebotstitel") val title: String,
    @JsonProperty("Arbeitsort_lat") val lat: String?,
    @JsonProperty("Arbeitsort_lng") val lng: String?,
    @JsonProperty("logoURL") val logo: String,
    @JsonProperty("url") val url: String,
    @JsonProperty("Einstelldatum") val creationDate: String,
    @JsonProperty("Ablaufdatum") val expiryDate: String?,
    @JsonProperty("Arbeitsort") val location: String,
    @JsonProperty("Anzeige_Text") val text: String?,
    @JsonProperty("Prs_Firma") val company: String?,
    @JsonProperty("Prs_Titel") val contactTitle: String?,
    @JsonProperty("Prs_Vorname") val contactForname: String?,
    @JsonProperty("Prs_Nachname") val contactSurname: String?,
    @JsonProperty("Prs_Email") val contactEmail: String?,
    @JsonProperty("country") val country: String?,
    @JsonProperty("FBs") val jobMarketFaculties: List<String>?,
    @JsonProperty("KT_1") val industries: List<String>?

) : JobMarketEntity() {
    fun toModel(faculties: List<FacultyRecord>) = JobDetails(
        id.toInt(), title, logo, JOB_PDF_URL_BASE + id.toInt(), JobMarketUtils.toBerlinOffset(creationDate),
        text ?: "", url, expiryDate?.let { JobMarketUtils.toBerlinOffset(it) },
        faculties.filter { jobMarketFaculties?.contains(it.jobmarketId.toString()) ?: false }.map { it.identifier },
        industries?.map { it.toInt() } ?: listOf(),
        company, lat?.toBigDecimal(), lng?.toBigDecimal(), contactTitle, contactForname, contactSurname, contactEmail, country
    )
}

class JobMarketIndustry(
    @JsonProperty("Kat_ID") val id: String,
    @JsonProperty("Kat_Bezeichnung") val identifier: String
) : JobMarketEntity() {
    fun toModel() = Industry(id.toInt(), identifier)
}

class JobMarketJobType(
    @JsonProperty("Jobtyp_ID") val id: String,
    @JsonProperty("Bezeichnung") val identifier: String
) : JobMarketEntity() {
    fun toModel() = JobType(id.toInt(), identifier)
}
