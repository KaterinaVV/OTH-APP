package de.oth.othappserver.service;

import java.lang.System;

/**
 * Service API declaration for organizer data access methods.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&\u00a8\u0006\u000b"}, d2 = {"Lde/oth/othappserver/service/IOrganizerService;", "", "getOrganizerByEmail", "Ljava/util/Optional;", "Lde/oth/othappserver/tables/pojos/TEventorganizer;", "email", "", "getOrganizerByName", "name", "getOrganizers", "", "oth-app-server"})
public abstract interface IOrganizerService {
    
    /**
     * Retrieves an organizer by its email address.
     *
     * @param email The requested orgnaizers email
     * @return [Optional.empty] if no organizer was found, else an [Optional] of the [TEventorganizer]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizerByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    /**
     * Retrieves an organizer by its name.
     *
     * @param name Name of the requested organizer.
     * @return [Optional.empty] if no organizer was found, else an [Optional] of the [TEventorganizer]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizerByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * Retrieves all organizers.
     *
     * @return A [List] of all [TEventorganizer]s
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizers();
}