package de.oth.othappserver.service

import de.oth.othappserver.exceptions.WebuntisNotAvailable
import de.oth.othappserver.model.*
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.time.LocalDate

interface IUniversityService { // define an interface
    /**
     * Retrieves basic information needed for a timetable.
     */
    // inherit class UniversityInfo in "UniversityInfo.kt"
    // {holidays, semesterPeriods, roomFinderFilter}
    fun getInformation(): UniversityInfo
}

@Service
@CacheConfig(cacheNames = [de.oth.othappserver.config.CacheConfig.SHORT_CACHE], keyGenerator = "customKeyGenerator")
@ConditionalOnProperty(WebUntisProperties.ENABLED)
private open class UniversityService(
    // open represents that tha class could be inherited

    private val webUntisService: IWebUntisService,
    /* "IWebUnitsService.kt"
    {Semester, Lecture, Room, Faculty, Holiday, Current schoolyear, Schoolyears, Teacher,
    SemesterLecture, LectureSemester, Timetable, TimetableLecture, RoomTimetable,
    FacultyLectures, RoomCache}

    Semester = {id, name ,longName}, WebUntisSemester = [id, name, longName, did]
    Lecture = {id, name, shortName}, WebUntisLecture = [id, shortName, longName]
    Room = {id, name, longName}, WebUntisRoom = [id, name, longName, building]
    Faculty = {identifier, name, color, feeds}, feeds = [rss, type(BULLETIN_BOARD)], WebUntisFaculty = [id, name, longName]
    Holiday = {name, longName, startDate, endDate}, WebUntisHoliday = [id, name, longName, startDate, endDate]
    WebUntisSchoolyear = {id, name, startDate, endDate}
    Schoolyear = [WebUntisSchoolyear] = [id, name, startDate, endDate]
    Lecturer = {id, name, foreName, longName, title}, Teacher = [id, name, longName, foreName, title, active, dids]
    SemesterLecture = [Lecture] = [id, startDate, endDate]
    LectureSemester = [Semester] = [id, startDate, endDate]
    WebUntisTimetable = {id, date, startTime, endTime, su, ro, kl, te}
    Timetable = [WebUntisTimetable] = [id, type, startDate, endDate]
    TimetableLecture = {id, name, shortName, uniqueOccurrences}, uniqueOccurrences = {nextStartDateTime, nextEndDateTime, semesters, rooms, lecturers}
    getTimetableLecture = {id, semesterId, startDate, endDate}
    getRoomTimetable = [id, date]
    getFacultyLectures = [Lecture] = [id, startDate, shortDate]
    */

    private val roomFinderService: IRoomFinderService
    /* "IRoomFinderService.kt"
    {getEquipment, getFilterEquipment, getBuildings}
    TEquipment = {id, info, name}

    OTHBuildings = {TBuilding, TBuildingFloors, TFaculty}
    TBuilding = {id, identifier}
    TBuildingFloors = {floor, building, plan}
    TFaculty = {id, identifier, name, color, webuntisId, jobmarketId}

     */
) : IUniversityService {

    /**
     * Retrieves basic information needed for a timetable.
     */
    @Cacheable
    override fun getInformation(): UniversityInfo {
        return runBlocking(Dispatchers.IO) {
            val holidays = async { WebuntisNotAvailable.runCatching { webUntisService.getHolidays() }.getOrElse { listOf() } }
            val schoolyears = async { WebuntisNotAvailable.runCatching { webUntisService.getSchoolyears() }.getOrElse { listOf() } }
            val roomEquipment = roomFinderService.getFilterEquipment()
                .map { Equipment(it.id, it.name, it.info) }
            val buildingLetters = roomFinderService.getBuildings().map { it.key }

            UniversityInfo(
                holidays.await().map { it.toModel() },
                schoolyears.await().map {
                    val start = LocalDate.parse(it.startDate, WebUntisUtils.WebUntisDateFormatter)
                    val end = LocalDate.parse(it.endDate, WebUntisUtils.WebUntisDateFormatter)

                    UniversityInfoSemesterPeriods(it.name, start, end)
                    // {name, start ,end}
                },
                UniversityInfoRoomFinderFilter(buildingLetters, roomEquipment, RoomType.values().toList())
                // {building, equipment, roomType}
                // equipment = {id, name, info}

            )
        }
    }
}
