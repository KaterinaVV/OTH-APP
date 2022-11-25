package de.oth.othappserver.rest

import de.oth.othappserver.api.RoomFinderApi
import de.oth.othappserver.model.*
import de.oth.othappserver.service.IRoomFinderService
import de.oth.othappserver.service.IWebUntisService
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisUtils.Companion.convertTimeToString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.zalando.problem.Problem
import org.zalando.problem.Status.BAD_REQUEST
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.streams.toList

@RestController
@ConditionalOnProperty(WebUntisProperties.ENABLED)
open class RoomFinderController internal constructor(
    private val roomFinderService: IRoomFinderService,
    private val webUntis: IWebUntisService
) : RoomFinderApi {

    companion object {
        private val SINGLE_HOUR_DATE_PATTERN: DateTimeFormatter = DateTimeFormatter.ofPattern("H:mm")
        private val END_DATE: LocalTime = LocalTime.of(23, 59)
        private val START_DATE: LocalTime = LocalTime.of(8, 0)
        const val CIP_POOL = "CIP-Pool"
        const val HOERSAAL = "Hörsaal"
        const val PLZ = "PLZ"
    }

    private val roomTypesMap = mapOf(
        Pair(RoomType.CIP_POOL, CIP_POOL),
        Pair(RoomType.HOERSAAL, HOERSAAL),
    )

    override fun freeRooms(start: String?, date: LocalDate?, end: String?, building: String?, equipment: List<Int>?, roomType: List<RoomType>?): ResponseEntity<List<FreeRoomBuilding>> {
        // validating date parameter
        val sDate = when {
            date == null ->
                LocalDate.now()
            LocalDate.now().plusDays(7L).isBefore(date) ->
                throw Problem.valueOf(BAD_REQUEST, "Query parameter 'date' has to be between today and the next 7 days (${LocalDate.now().plusDays(7L)}).")
            LocalDate.now().isAfter(date) ->
                throw Problem.valueOf(BAD_REQUEST, "Query parameter 'date' can not be in the past.")
            else -> date
        }

        // get the mapping of rooms to there equipments
        val roomEquipments = roomFinderService.getEquipment()

        // get the mapping of buildings to faculties
        val buildings = roomFinderService.getBuildings()

        // get all rooms
        var rooms = webUntis.getRooms()

        // if the equipment filter is set, remove all rooms without the equipment
        if (equipment != null) {
            val matchingRooms = roomEquipments.filter { re -> re.value.any { roomEquipment -> equipment.any { e -> roomEquipment.id == e } } }
                .map { it.key }
            rooms = rooms.filter { webUntisRoom -> matchingRooms.any { room -> webUntisRoom.name == room } }
        }

        // if the building filter is set, remove all rooms with other letter
        if (building != null) {
            rooms = rooms.filter { x -> x.name.toUpperCase()[0] == building.toUpperCase()[0] }
        }

        // if the roomType filter is set, remove all rooms with other type
        if (roomType != null) {
            rooms = rooms.filter { room ->
                roomTypesMap.filterKeys { r ->
                    roomType.any { t -> r == t }
                }.any { e -> room.longName.contains(e.value, true) }
            }
        }

        // create mapping of building letters and there rooms
        val roomMap = mutableMapOf<Char, MutableList<FreeRoom>>()
        rooms.map { x -> x.name.toUpperCase()[0] }.stream()
            .filter { x -> x != '1' && x != '2' }
            .filter { !roomMap.contains(it) }
            .forEach { roomMap[it] = mutableListOf() }

        // actual time
        val now =
            if (start != null && start != "now") {
                LocalTime.parse(start)
            } else {
                LocalTime.now()
            }

        runBlocking {
            withContext(Dispatchers.IO) {
                rooms.map {
                    async {
                        val timetable = webUntis.getRoomTimetable(it.id, sDate)

                        Pair(it, timetable)
                    }
                }.map { it.await() }
            }
        }.forEach { result ->
            val (room, timetable) = result

            // extract room type
            val type = when {
                room.longName.contains(CIP_POOL, true) -> RoomType.CIP_POOL
                room.longName.contains(HOERSAAL, true) -> RoomType.HOERSAAL
                else -> return@forEach
            }

            // get equipment list of the room
            val equip = roomEquipments[room.name]?.map { it.id } ?: listOf()

            // list of free room time slots
            val times = mutableListOf<FreeTime>()

            // check if the room has timetable items
            if (timetable.isNotEmpty()) {
                timetable.forEachIndexed { index, item ->
                    val startTime = convertStringToTime(item.startTime)
                    val endTime = convertStringToTime(item.endTime)

                    if (times.size > 1 || (end != null && endTime.isAfter(LocalTime.of(end.split(":")[0].toInt(), end.split(":")[1].toInt())))) {
                        return@forEachIndexed
                    }

                    // if the first item starts in the future
                    if (startTime.isAfter(now) && index == 0) {
                        times.add(FreeTime(start = "start", end = convertTimeToString(startTime)))
                    }

                    // if one items goes the complete day, go to the next room
                    val diff = LocalTime.ofSecondOfDay(endTime.toSecondOfDay().minus(startTime.toSecondOfDay()).toLong())
                    if (diff.hour == 23) {
                        return@forEach
                    }

                    // if its the last item
                    if (index == timetable.lastIndex) {
                        times.add(FreeTime(start = convertTimeToString(endTime), end = "end"))
                    } else if (endTime.plusMinutes(15).isBefore(convertStringToTime(timetable[index + 1].startTime))) {
                        // if isn't the last item and not a pause between too courses
                        times.add(FreeTime(start = convertTimeToString(endTime), end = convertTimeToString(convertStringToTime(timetable[index + 1].startTime))))
                    }
                }
            } else {
                times.add(FreeTime(start = "start", end = "end"))
            }

            if (times.isEmpty()) {
                return@forEach
            }

            val floor = when {
                room.name.length == 4 && room.name[1].isDigit() -> Character.getNumericValue(room.name[1])
                room.name.length == 5 && room.name[1].isDigit() -> -1
                else -> null
            }

            // add room to the building letter
            val freeRoom = FreeRoom(room.name.toUpperCase(), room.longName, type, equip, times, floor)
            roomMap[room.name.toUpperCase()[0]]?.add(freeRoom)
        }

        // sort room list
        roomMap.forEach { e ->
            val list = e.value.stream().sorted { a, b ->
                val timeA = a.times.map { t -> (convertFreeTimeToLocalTime(t.end).toSecondOfDay() - convertFreeTimeToLocalTime(t.start).toSecondOfDay()) }.first()
                val timeB = b.times.map { t -> (convertFreeTimeToLocalTime(t.end).toSecondOfDay() - convertFreeTimeToLocalTime(t.start).toSecondOfDay()) }.first()
                if (a.times.first().start == b.times.first().start) {
                    if (timeA == timeB) {
                        b.times.size.compareTo(a.times.size)
                    } else {
                        timeB.compareTo(timeA)
                    }
                } else {
                    convertFreeTimeToLocalTime(a.times.first().start).compareTo(convertFreeTimeToLocalTime(b.times.first().start))
                }
            }.toList().toMutableList()

            roomMap.replace(e.key, list)
        }

        // create the response out of the mapping of building letters and their rooms
        val result = roomMap.keys.map { x ->
            val roomBuilding = buildings[x.toString()]
            val faculties = roomBuilding?.faculties?.map { it.identifier } ?: listOf()
            val plans = roomBuilding?.floors?.map { FreeRoomBuildingPlans(it.floor, it.plan) } ?: listOf()

            FreeRoomBuilding(
                letter = x.toString(),
                rooms = roomMap[x]!!.toList(),
                faculties = faculties,
                plans = plans
            )
        }

        return ResponseEntity.ok().body(result)
    }

    // convert strings in format of "915" to LocalTime objects
    private fun convertStringToTime(time: String): LocalTime {
        return if (time.length <= 2) {
            LocalTime.of(time.toInt(), 0)
        } else {
            LocalTime.of(time.substring(0, time.length - 2).toInt(), time.substring(time.length - 2, time.length).toInt())
        }
    }

    private fun convertFreeTimeToLocalTime(time: String): LocalTime = when (time) {
        "end" -> END_DATE
        "now" -> LocalTime.now()
        "start" -> START_DATE
        else -> LocalTime.parse(time, SINGLE_HOUR_DATE_PATTERN)
    }
}
