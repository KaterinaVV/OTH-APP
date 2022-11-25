/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBuildingFaculties implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer building;
    private final Integer faculty;

    public TBuildingFaculties(TBuildingFaculties value) {
        this.building = value.building;
        this.faculty = value.faculty;
    }

    public TBuildingFaculties(
        Integer building,
        Integer faculty
    ) {
        this.building = building;
        this.faculty = faculty;
    }

    /**
     * Getter for <code>public.building_faculties.building</code>.
     */
    public Integer getBuilding() {
        return this.building;
    }

    /**
     * Getter for <code>public.building_faculties.faculty</code>.
     */
    public Integer getFaculty() {
        return this.faculty;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TBuildingFaculties other = (TBuildingFaculties) obj;
        if (building == null) {
            if (other.building != null)
                return false;
        }
        else if (!building.equals(other.building))
            return false;
        if (faculty == null) {
            if (other.faculty != null)
                return false;
        }
        else if (!faculty.equals(other.faculty))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.building == null) ? 0 : this.building.hashCode());
        result = prime * result + ((this.faculty == null) ? 0 : this.faculty.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TBuildingFaculties (");

        sb.append(building);
        sb.append(", ").append(faculty);

        sb.append(")");
        return sb.toString();
    }
}
