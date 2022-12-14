/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package de.oth.othappserver.api

import de.oth.othappserver.model.Error
import de.oth.othappserver.model.Semester
import de.oth.othappserver.model.TimetableLecture
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface TimetableApi {


    @GetMapping(
            value = ["/v1/timetable/lectures/{id}"],
            produces = ["application/json"]
    )
    fun timetableLecture( @PathVariable("id") id: kotlin.Int
, @RequestParam(value = "semesterId", required = false) semesterId: kotlin.Int?
, @RequestParam(value = "startDate", required = false) startDate: java.time.LocalDate?
, @RequestParam(value = "endDate", required = false) endDate: java.time.LocalDate?
): ResponseEntity<TimetableLecture> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
            value = ["/v1/timetable/lectures/{id}/semesters"],
            produces = ["application/json"]
    )
    fun timetableLectureSemesters( @PathVariable("id") id: kotlin.Int
, @RequestParam(value = "startDate", required = false) startDate: java.time.LocalDate?
, @RequestParam(value = "endDate", required = false) endDate: java.time.LocalDate?
): ResponseEntity<List<Semester>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
