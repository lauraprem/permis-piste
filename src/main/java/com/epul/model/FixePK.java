package com.epul.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by Pierre on 03/06/2015.
 */
public class FixePK implements Serializable {
    private int nummission;
    private int numobjectif;

    @Column(name = "NUMMISSION")
    @Id
    public int getNummission() {
        return nummission;
    }

    public void setNummission(int nummission) {
        this.nummission = nummission;
    }

    @Column(name = "NUMOBJECTIF")
    @Id
    public int getNumobjectif() {
        return numobjectif;
    }

    public void setNumobjectif(int numobjectif) {
        this.numobjectif = numobjectif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixePK fixePK = (FixePK) o;

        if (nummission != fixePK.nummission) return false;
        if (numobjectif != fixePK.numobjectif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nummission;
        result = 31 * result + numobjectif;
        return result;
    }
}
