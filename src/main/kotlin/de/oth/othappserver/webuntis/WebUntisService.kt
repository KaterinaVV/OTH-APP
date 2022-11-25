package de.oth.othappserver.webuntis

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import de.oth.othappserver.config.CacheConfig.Companion.DAY_CACHE
import de.oth.othappserver.model.*
import de.oth.othappserver.rest.RoomFinderController
import de.oth.othappserver.service.IRoomFinderService
import de.oth.othappserver.service.IWebUntisService
import kotlinx.coroutines.*
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalTime
import java.util.concurrent.TimeUnit
import kotlin.streams.toList

@Service
@ConditionalOnProperty(WebUntisProperties.ENABLED)
@CacheConfig(cacheNames = [DAY_CACHE], keyGenerator = "customKeyGenerator")
open class WebUntisService(
    private val webUntisClient: WebUntisClient,
    private val roomFinderService: IRoomFinderService,
) : IWebUntisService {

    companion object {
        private val logger = LoggerFactory.getLogger(WebUntisService::class.java)
    }

    private val roomsTimetableCache = Caffeine.newBuilder()
        .expireAfterWrite(1, TimeUnit.DAYS)
        .refreshAfterWrite(1, TimeUnit.HOURS)
        .maximumSize(7 * 500)
        .recordStats()
        .build(this::getRoomTimeTable)

    override fun getRoomCache(): Cache<Any, Any> = roomsTimetableCache as Cache<Any, Any>

    @Cacheable
    override fun getSemesters(): List<WebUntisSemester> = webUntisClient.getAll(WebUntisRequests.getSemesters())

    @Cacheable
    override fun getLectures(): List<WebUntisLecture> = webUntisClient.getAll(WebUntisRequests.getLectures())

    @Cacheable
    override fun getRooms(): List<WebUntisRoom> {
        val buildings = roomFinderService.getBuildings()

        return webUntisClient.getAll(WebUntisRequests.getRooms())
            .filter { buildings.containsKey(it.name.toUpperCase()[0].toString()) }
            .filter { it.longName.contains(RoomFinderController.CIP_POOL, true) || it.longName.contains(RoomFinderController.HOERSAAL, true) }
    }

    @Cacheable
    override fun getFaculties(): List<WebUntisFaculty> = webUntisClient.getAll(WebUntisRequests.getFaculties())

    @Cacheable
    override fun getHolidays(): List<WebUntisHoliday> = webUntisClient.getAll(WebUntisRequests.getHolidays())

    @Cacheable
    override fun getCurrentSchoolyear(): WebUntisSchoolyear = webUntisClient.get(WebUntisRequests.getCurrentSchoolyear())

    @Cacheable
    override fun getSchoolyears(): List<WebUntisSchoolyear> = webUntisClient.getAll(WebUntisRequests.getSchoolyears())

    @Cacheable
    override fun getTeachers(): List<WebUntisTeacher> = webUntisClient.getAll(WebUntisRequests.getTeachers())

    @Cacheable
    override fun getTimetable(id: Int, type: WebUnitsResourceType, startDate: LocalDate?, endDate: LocalDate?): List<WebUntisTimetable> {
        return if (startDate != null && endDate != null) {
            webUntisClient.getAll(WebUntisRequests.getTimetable(id, type, startDate, endDate))
        } else {
            webUntisClient.getAll(WebUntisRequests.getTimetable(id, type))
        }
    }

    @Cacheable
    override fun getTimetableLecture(id: Int, semesterId: Int?, startDate: LocalDate?, endDate: LocalDate?): TimetableLecture {
        // Get timetable elements for the lecture and filter the timetable elements for the right semester
        var timetableItems = webUntisClient.getAll(
            WebUntisRequests.getTimetableCustomizable(
                elementId = id,
                type = WebUnitsResourceType.LECTURE,
                startDate = startDate,
                endDate = endDate,
                embedSubjectNames = true,
                embedRoomNames = true,
                embedSemesterNames = true,
                embedTeacherNames = true
            )
        )
        if (semesterId != null) timetableItems = timetableItems.filter { timetableItem -> timetableItem.kl.any { it.id == semesterId } }

        // Extract lecture information from the first timetable element
        // When WebUntis returns an empty list of timetable elements, an extra call needs to be made to get the information
        val lectureInformation = timetableItems.firstOrNull()?.su?.first { it.id == id }
        val lectureName = lectureInformation?.longName ?: getLectures().first { it.id == id }.longName
        val lectureShortName = lectureInformation?.name ?: getLectures().first { it.id == id }.toModel().shortName

        // Build the unique occurrences list
        val uniqueTimetableOccurrences: MutableList<WebUntisTimetable> = mutableListOf()
        // For every returned timetable item, check if there is already a ("duplicate") unique occurrence stored in the unique occurrences
        // list (same subject, weekday and timeslot). If that is the case, merge the rooms/lecturer/semester list with the already stored
        // occurrence, as WebUntis might return multiple different timetable periods (with same subject and timeslot but different
        // room/etc. list), if the lecture is hold in multiple rooms/by multiple lecturers/offered by multiple semesters.
        // If the occurrence is not stored in the list, add it.
        for (item in timetableItems) {
            val duplicateUniqueOccurrenceInList = uniqueTimetableOccurrences.firstOrNull { it.equalsUniqueOccurrence(item, id) }
            if (duplicateUniqueOccurrenceInList != null) {
                duplicateUniqueOccurrenceInList.ro = duplicateUniqueOccurrenceInList.ro.plus(item.ro).distinct()
                duplicateUniqueOccurrenceInList.kl = duplicateUniqueOccurrenceInList.kl.plus(item.kl).distinct()
                duplicateUniqueOccurrenceInList.te = duplicateUniqueOccurrenceInList.te.plus(item.te).distinct()
            } else {
                uniqueTimetableOccurrences.add(item)
            }
        }

        // Map the unique occurrences to the required return schema
        val lectureUniqueOccurrences = uniqueTimetableOccurrences.map { occurrence ->
            TimetableLectureUniqueOccurrences(
                nextStartDateTime = occurrence.startDateTime,
                nextEndDateTime = occurrence.endDateTime,
                semesters = occurrence.kl.map { klasse ->
                    Semester(
                        id = klasse.id,
                        name = klasse.name ?: getSemesters().first { it.id == klasse.id }.name,
                        longName = klasse.longName ?: getSemesters().first { it.id == klasse.id }.longName
                    )
                }.sortedBy { it.name },
                rooms = occurrence.ro.map { room ->
                    Room(
                        id = room.id,
                        name = room.name ?: getRooms().first { it.id == room.id }.name,
                        longName = room.longName ?: getRooms().first { it.id == room.id }.longName
                    )
                }.sortedBy { it.name },
                lecturers = occurrence.te.map { teacher ->
                    Lecturer(
                        id = teacher.id,
                        name = teacher.name ?: getTeachers().first { it.id == teacher.id }.name,
                        longName = teacher.longName ?: getTeachers().first { it.id == teacher.id }.longName
                    )
                }.sortedBy { it.name }
            )
        }.sortedBy {
            it.nextStartDateTime
        }

        return TimetableLecture(
            id = id,
            name = lectureName,
            shortName = lectureShortName,
            uniqueOccurrences = lectureUniqueOccurrences
        )
    }

    @Cacheable
    override fun getLectureSemesters(id: Int, startDate: LocalDate?, endDate: LocalDate?): List<Semester> {
        return webUntisClient.getAll(
            WebUntisRequests.getTimetableCustomizable(
                elementId = id,
                type = WebUnitsResourceType.LECTURE,
                startDate = startDate,
                endDate = endDate,
                embedSemesterNames = true
            )
        ).asSequence().map { it.kl }.flatten().distinctBy { it.id }.sortedBy { it.name }.map { klasse -> Semester(
            id = klasse.id,
            name = klasse.name ?: getSemesters().first { it.id == klasse.id }.name,
            longName = klasse.longName ?: getSemesters().first { it.id == klasse.id }.longName
        )
        }.toList()
    }

    @Cacheable
    override fun getFacultyLectures(facultyId: Int, startDate: LocalDate, endDate: LocalDate): List<Lecture> {
        val webuntisFaculty = getFaculties()
            .first { it.id == facultyId }
        val semesters = getSemesters()
            .filter { it.did == webuntisFaculty.id }
        val lecturesMap = getLectures()
            .associateBy({ it.id }, { it })

        return runBlocking {
            val job = SupervisorJob()
            val scope = CoroutineScope(Dispatchers.IO + job)

            // For each course of studies (= "semester") (e.g. MIN), get all lectures that have a timetable occurrence
            // in the given time window defined by startDate and endDate
            semesters.map { semester ->
                val deferred = scope.async {
                    doGetSemesterLectures(semester.id, startDate, endDate)
                }
                Pair(semester, deferred)
            }.mapNotNull { (semester, deferred) ->
                try {
                    deferred.await()
                } catch (e: Exception) {
                    logger.error("Failed to get lectures for semester ${semester.name}.")
                    null
                }
            }.map { semesterLectures ->
                semesterLectures.mapNotNull { lecturesMap[it.id] }
                    .map { it.toModel() }
            }.flatten().distinctBy { it.id }.sortedBy { it.name }
        }
    }

    @Cacheable
    override fun getSemesterLectures(id: Int, startDate: LocalDate, endDate: LocalDate): List<Lecture> {
        return webUntisClient.getAll(
            WebUntisRequests.getTimetableCustomizable(
                elementId = id,
                type = WebUnitsResourceType.SEMESTER,
                startDate = startDate,
                endDate = endDate,
                embedSubjectNames = true
        )).asSequence().map { it.su }.flatten().distinctBy { it.id }.sortedBy { it.name }.map { subject -> Lecture(
            id = subject.id,
            name = subject.longName ?: getLectures().first { it.id == subject.id }.longName,
            shortName = subject.name ?: getLectures().first { it.id == subject.id }.name
        ) }.toList()
    }

    // Get a list of id's of all lectures, that have a timetable occurrence in the defined time window
    private fun doGetSemesterLectures(id: Int, startDate: LocalDate, endDate: LocalDate): List<BaseWebUntisResource> {
        val request = WebUntisRequests.getTimetable(
            id,
            WebUnitsResourceType.SEMESTER,
            startDate,
            endDate
        )
        val response = webUntisClient.getAll(request)

        return response.flatMap { it.su }
            .distinctBy { it.id }
            .map { BaseWebUntisResource(it.id) }
    }

    // convert strings in format of "915" to LocalTime objects
    private fun convertStringToTime(time: String): LocalTime {
        return if (time.length <= 2) {
            LocalTime.of(time.toInt(), 0)
        } else {
            LocalTime.of(time.substring(0, time.length - 2).toInt(), time.substring(time.length - 2, time.length).toInt())
        }
    }

    override fun getRoomTimetable(id: Int, date: LocalDate): List<WebUntisTimetable> {
        return roomsTimetableCache.get("${id}_$date")!!
    }

    private fun getRoomTimeTable(key: String): List<WebUntisTimetable> {
        val (id, dateString) = key.split("_")
        val date = LocalDate.parse(dateString)

        logger.debug("Refreshing cache for room $id for day $dateString.")
        return webUntisClient.getAll(WebUntisRequests.getTimetable(id.toInt(), WebUnitsResourceType.ROOM, date, date))
            .stream()
            .sorted { x, y -> convertStringToTime(x.startTime).compareTo(convertStringToTime(y.startTime)) }
            .toList()
    }
}
