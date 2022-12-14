/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEventorganizer implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String  name;
    private final String  email;
    private final String  description;

    public TEventorganizer(TEventorganizer value) {
        this.id = value.id;
        this.name = value.name;
        this.email = value.email;
        this.description = value.description;
    }

    public TEventorganizer(
        Integer id,
        String  name,
        String  email,
        String  description
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.description = description;
    }

    /**
     * Getter for <code>public.eventorganizer.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.eventorganizer.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.eventorganizer.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for <code>public.eventorganizer.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TEventorganizer other = (TEventorganizer) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TEventorganizer (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
