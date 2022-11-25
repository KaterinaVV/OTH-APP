package de.oth.othappserver.service

import de.oth.othappserver.tables.pojos.TEventorganizer
import java.util.*

/**
 * Service API declaration for organizer data access methods.
 */
interface IOrganizerService {
    /**
     * Retrieves an organizer by its email address.
     *
     * @param email The requested orgnaizers email
     * @return [Optional.empty] if no organizer was found, else an [Optional] of the [TEventorganizer]
     */
    fun getOrganizerByEmail(email: String): Optional<TEventorganizer>

    /**
     * Retrieves an organizer by its name.
     *
     * @param name Name of the requested organizer.
     * @return [Optional.empty] if no organizer was found, else an [Optional] of the [TEventorganizer]
     */
    fun getOrganizerByName(name: String): Optional<TEventorganizer>

    /**
     * Retrieves all organizers.
     *
     * @return A [List] of all [TEventorganizer]s
     */
    fun getOrganizers(): List<TEventorganizer>
    // [id, name, email, description]

}
