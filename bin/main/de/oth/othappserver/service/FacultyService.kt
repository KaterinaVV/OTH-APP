package de.oth.othappserver.service

import de.oth.othappserver.Tables.FACULTY
import de.oth.othappserver.Tables.FEED
import de.oth.othappserver.config.CacheConfig.Companion.LIFETIME_CACHE
import de.oth.othappserver.tables.records.FacultyRecord
import de.oth.othappserver.tables.records.FeedRecord
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.zalando.problem.Problem
import org.zalando.problem.Status.NOT_FOUND

@Service
@CacheConfig(cacheNames = [LIFETIME_CACHE], keyGenerator = "customKeyGenerator")
private open class FacultyService @Autowired constructor(
    // DSL = domain specific language, dynamic layout
    private val dsl: DSLContext
) : IFacultyService {

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun faculties(): Map<FacultyRecord, List<FeedRecord>> {
        return dsl.select()
            .from(FACULTY)
            .leftJoin(FEED).on(FACULTY.ID.eq(FEED.FACULTY))
            .fetchGroups(
                { r -> r.into(FACULTY) },
                { r -> r.into(FEED) }
            )
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun faculty(identifier: String): FacultyRecord {
        return dsl.fetchOne(FACULTY.where(FACULTY.IDENTIFIER.eq(identifier))) ?: throw Problem.valueOf(NOT_FOUND, "Faculty '$identifier' not found.")
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun facultyFeeds(identifier: String): Pair<FacultyRecord, List<FeedRecord>> {
        val facultyMap = dsl.select()
            .from(FACULTY)
            .join(FEED).on(FACULTY.ID.eq(FEED.FACULTY))
            .where(FACULTY.IDENTIFIER.eq(identifier))
            .limit(1).offset(0)
            .fetchGroups(
                { r -> r.into(FACULTY) },
                { r -> r.into(FEED) }
            )

        if (facultyMap.isEmpty()) throw Problem.valueOf(NOT_FOUND, "Faculty '$identifier' not found.")

        val faculty = facultyMap.iterator().next()

        return Pair(faculty.key, faculty.value)
    }
}
