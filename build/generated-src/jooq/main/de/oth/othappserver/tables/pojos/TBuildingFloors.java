/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBuildingFloors implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer floor;
    private final Integer building;
    private final String  plan;

    public TBuildingFloors(TBuildingFloors value) {
        this.floor = value.floor;
        this.building = value.building;
        this.plan = value.plan;
    }

    public TBuildingFloors(
        Integer floor,
        Integer building,
        String  plan
    ) {
        this.floor = floor;
        this.building = building;
        this.plan = plan;
    }

    /**
     * Getter for <code>public.building_floors.floor</code>.
     */
    public Integer getFloor() {
        return this.floor;
    }

    /**
     * Getter for <code>public.building_floors.building</code>.
     */
    public Integer getBuilding() {
        return this.building;
    }

    /**
     * Getter for <code>public.building_floors.plan</code>.
     */
    public String getPlan() {
        return this.plan;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TBuildingFloors other = (TBuildingFloors) obj;
        if (floor == null) {
            if (other.floor != null)
                return false;
        }
        else if (!floor.equals(other.floor))
            return false;
        if (building == null) {
            if (other.building != null)
                return false;
        }
        else if (!building.equals(other.building))
            return false;
        if (plan == null) {
            if (other.plan != null)
                return false;
        }
        else if (!plan.equals(other.plan))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.floor == null) ? 0 : this.floor.hashCode());
        result = prime * result + ((this.building == null) ? 0 : this.building.hashCode());
        result = prime * result + ((this.plan == null) ? 0 : this.plan.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TBuildingFloors (");

        sb.append(floor);
        sb.append(", ").append(building);
        sb.append(", ").append(plan);

        sb.append(")");
        return sb.toString();
    }
}
