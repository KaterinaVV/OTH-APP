package de.oth.othappserver.service

import de.oth.othappserver.Tables
import de.oth.othappserver.config.CacheConfig.Companion.DAY_CACHE
import de.oth.othappserver.tables.pojos.TEventorganizer
import org.jooq.DSLContext
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@CacheConfig(cacheNames = [DAY_CACHE], keyGenerator = "customKeyGenerator")
private open class OrganizerService(private val dsl: DSLContext) : IOrganizerService {

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun getOrganizerByEmail(email: String): Optional<TEventorganizer> {
        return dsl.select(Tables.EVENTORGANIZER.ID, Tables.EVENTORGANIZER.NAME, Tables.EVENTORGANIZER.EMAIL, Tables.EVENTORGANIZER.DESCRIPTION)
            .from(Tables.EVENTORGANIZER)
            .where(Tables.EVENTORGANIZER.EMAIL.eq(email))
            .fetchOptional { record ->
                val (id, name, emailRecord, description) = record
                TEventorganizer(id, name, emailRecord, description)
            }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun getOrganizerByName(name: String): Optional<TEventorganizer> {
        return dsl.select(Tables.EVENTORGANIZER.ID, Tables.EVENTORGANIZER.NAME, Tables.EVENTORGANIZER.EMAIL, Tables.EVENTORGANIZER.DESCRIPTION)
            .from(Tables.EVENTORGANIZER)
            .where(Tables.EVENTORGANIZER.NAME.equalIgnoreCase(name.trim()))
            .fetchOptional { record ->
                val (id, recordName, emailRecord, description) = record
                TEventorganizer(id, recordName, emailRecord, description)
            }
    }

    @Cacheable
    override fun getOrganizers(): List<TEventorganizer> {
        return dsl.select(Tables.EVENTORGANIZER.ID, Tables.EVENTORGANIZER.NAME, Tables.EVENTORGANIZER.EMAIL, Tables.EVENTORGANIZER.DESCRIPTION)
            .from(Tables.EVENTORGANIZER)
            .fetch { record ->
                val (id, name, email, description) = record
                TEventorganizer(id, name, email, description)
            }
    }
}
