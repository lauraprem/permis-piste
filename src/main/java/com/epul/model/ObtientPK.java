package com.epul.model;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by Pierre on 03/06/2015.
 */
public class ObtientPK implements Serializable {
    private int numapprenant;
    private int numaction;
    private int idjeu;

    @Column(name = "NUMAPPRENANT")
    @Id
    public int getNumapprenant() {
        return numapprenant;
    }

    public void setNumapprenant(int numapprenant) {
        this.numapprenant = numapprenant;
    }

    @Column(name = "NUMACTION")
    @Id
    public int getNumaction() {
        return numaction;
    }

    public void setNumaction(int numaction) {
        this.numaction = numaction;
    }

    @Column(name = "IDJEU")
    @Id
    public int getIdjeu(){
        return this.idjeu;
    }

    public void setIdjeu(int idjeu){
        this.idjeu = idjeu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObtientPK obtientPK = (ObtientPK) o;

        if (numapprenant != obtientPK.numapprenant) return false;
        if (numaction != obtientPK.numaction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numapprenant;
        result = 31 * result + numaction;
        return result;
    }
}
