package com.epul.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by Pierre on 03/06/2015.
 */
public class AppartientPK implements Serializable {
    private int numjeu;
    private int numaction;

    @Column(name = "NUMJEU")
    @Id
    public int getNumjeu() {
        return numjeu;
    }

    public void setNumjeu(int numjeu) {
        this.numjeu = numjeu;
    }

    @Column(name = "NUMACTION")
    @Id
    public int getNumaction() {
        return numaction;
    }

    public void setNumaction(int numaction) {
        this.numaction = numaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppartientPK that = (AppartientPK) o;

        if (numjeu != that.numjeu) return false;
        if (numaction != that.numaction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numjeu;
        result = 31 * result + numaction;
        return result;
    }
}
