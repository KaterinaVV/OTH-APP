package de.oth.othappserver.service

import de.oth.othappserver.tables.records.FacultyRecord
import de.oth.othappserver.tables.records.FeedRecord

/**
 * Service API declaration for faculty data access methods.
 */
interface IFacultyService {
    /**
     * Resolves a list of all faculties.
     */
    fun faculties(): Map<FacultyRecord, List<FeedRecord>>

    /**
     * Resolves one specific faculty and its feeds found by its identifier.
     * @param identifier The requested faculty's identifier
     */
    fun facultyFeeds(identifier: String): Pair<FacultyRecord, List<FeedRecord>>

    /**
     * Resolves one specific faculty found by its identifier.
     * @param identifier The requested faculty's identifier
     */
    fun faculty(identifier: String): FacultyRecord
}
