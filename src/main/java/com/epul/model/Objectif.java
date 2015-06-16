package com.epul.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Pierre on 16/06/2015.
 */
@Entity
public class Objectif {
    private int numobjectif;
    private String libobjectif;
    private Collection<EstAssocie> estAssociesByNumobjectif;
    private Collection<Fixe> fixesByNumobjectif;

    @Id
    @Column(name = "NUMOBJECTIF")
    public int getNumobjectif() {
        return numobjectif;
    }

    public void setNumobjectif(int numobjectif) {
        this.numobjectif = numobjectif;
    }

    @Basic
    @Column(name = "LIBOBJECTIF")
    public String getLibobjectif() {
        return libobjectif;
    }

    public void setLibobjectif(String libobjectif) {
        this.libobjectif = libobjectif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objectif objectif = (Objectif) o;

        if (numobjectif != objectif.numobjectif) return false;
        if (libobjectif != null ? !libobjectif.equals(objectif.libobjectif) : objectif.libobjectif != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numobjectif;
        result = 31 * result + (libobjectif != null ? libobjectif.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "objectifByNumobjectif")
    public Collection<EstAssocie> getEstAssociesByNumobjectif() {
        return estAssociesByNumobjectif;
    }

    public void setEstAssociesByNumobjectif(Collection<EstAssocie> estAssociesByNumobjectif) {
        this.estAssociesByNumobjectif = estAssociesByNumobjectif;
    }

    @OneToMany(mappedBy = "objectifByNumobjectif")
    public Collection<Fixe> getFixesByNumobjectif() {
        return fixesByNumobjectif;
    }

    public void setFixesByNumobjectif(Collection<Fixe> fixesByNumobjectif) {
        this.fixesByNumobjectif = fixesByNumobjectif;
    }
}
