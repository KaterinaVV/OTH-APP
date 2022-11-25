package de.oth.othappserver.rest

import de.oth.othappserver.api.EventCalendarApi
import de.oth.othappserver.model.Category
import de.oth.othappserver.model.EventQueryResult
import de.oth.othappserver.model.Organizer
import de.oth.othappserver.service.IEventCalendarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
open class EventCalendarController internal constructor(private val eventCalendarService: IEventCalendarService) : EventCalendarApi {

    override fun categories(): ResponseEntity<List<Category>> {
        val categories = eventCalendarService.getCategories()

        return ResponseEntity.ok()
            .body(categories.map { Category(it.name, it.color) })
    }

    override fun queryEvents(minStartDate: String, maxStartDate: String, deltaToken: String?, skipToken: String?, paged: Boolean): ResponseEntity<EventQueryResult> {
        val result = eventCalendarService.queryEvents(minStartDate, maxStartDate, deltaToken, skipToken, paged)

        return ResponseEntity.ok(result)
    }

    override fun organizers(): ResponseEntity<List<Organizer>> {
        val organizers = eventCalendarService.getOrganizers()

        return ResponseEntity.ok()
            .body(organizers.map { Organizer(it.email, it.name, it.description) })
    }
}
