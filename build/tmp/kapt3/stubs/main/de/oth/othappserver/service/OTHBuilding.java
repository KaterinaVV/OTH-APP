package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000J\t\u0010\u001b\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lde/oth/othappserver/service/OTHBuilding;", "", "building", "Lde/oth/othappserver/tables/pojos/TBuilding;", "floors", "", "Lde/oth/othappserver/tables/pojos/TBuildingFloors;", "faculties", "Lde/oth/othappserver/tables/pojos/TFaculty;", "(Lde/oth/othappserver/tables/pojos/TBuilding;Ljava/util/Set;Ljava/util/Set;)V", "getBuilding", "()Lde/oth/othappserver/tables/pojos/TBuilding;", "getFaculties", "()Ljava/util/Set;", "getFloors", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "key", "", "merge", "toString", "oth-app-server"})
public final class OTHBuilding {
    @org.jetbrains.annotations.NotNull()
    private final de.oth.othappserver.tables.pojos.TBuilding building = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<de.oth.othappserver.tables.pojos.TBuildingFloors> floors = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<de.oth.othappserver.tables.pojos.TFaculty> faculties = null;
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.service.OTHBuilding merge(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.OTHBuilding other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.tables.pojos.TBuilding getBuilding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<de.oth.othappserver.tables.pojos.TBuildingFloors> getFloors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<de.oth.othappserver.tables.pojos.TFaculty> getFaculties() {
        return null;
    }
    
    public OTHBuilding(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.tables.pojos.TBuilding building, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends de.oth.othappserver.tables.pojos.TBuildingFloors> floors, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends de.oth.othappserver.tables.pojos.TFaculty> faculties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.tables.pojos.TBuilding component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<de.oth.othappserver.tables.pojos.TBuildingFloors> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<de.oth.othappserver.tables.pojos.TFaculty> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.service.OTHBuilding copy(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.tables.pojos.TBuilding building, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends de.oth.othappserver.tables.pojos.TBuildingFloors> floors, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends de.oth.othappserver.tables.pojos.TFaculty> faculties) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}