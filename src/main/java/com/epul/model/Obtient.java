package com.epul.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by Pierre on 03/06/2015.
 */
@Entity
@IdClass(ObtientPK.class)
public class Obtient {
    private int numapprenant;
    private String datejour;
    private int numaction;
    private int idjeu;
    private Integer valeurdebut;
    private Integer valeurfin;

    @Id
    @Column(name = "NUMAPPRENANT")
    public int getNumapprenant() {
        return numapprenant;
    }

    public void setNumapprenant(int numapprenant) {
        this.numapprenant = numapprenant;
    }

    @Id
    @Column(name = "IDJEU")
    public int getIdjeu(){
        return idjeu;
    }

    public void setIdjeu(int idjeu){
        this.idjeu = idjeu;
    }

    @Id
    @Column(name = "DATEJOUR")
    public String getDatejour() {
        return datejour;
    }

    public void setDatejour(String datejour) {
        this.datejour = datejour;
    }

    @Id
    @Column(name = "NUMACTION")
    public int getNumaction() {
        return numaction;
    }

    public void setNumaction(int numaction) {
        this.numaction = numaction;
    }

    @Basic
    @Column(name = "VALEURDEBUT")
    public Integer getValeurdebut() {
        return valeurdebut;
    }

    public void setValeurdebut(Integer valeurdebut) {
        this.valeurdebut = valeurdebut;
    }

    @Basic
    @Column(name = "VALEURFIN")
    public Integer getValeurfin() {
        return valeurfin;
    }

    public void setValeurfin(Integer valeurfin) {
        this.valeurfin = valeurfin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obtient obtient = (Obtient) o;

        if (numapprenant != obtient.numapprenant) return false;
        if (numaction != obtient.numaction) return false;
        if (datejour != null ? !datejour.equals(obtient.datejour) : obtient.datejour != null) return false;
        if (valeurdebut != null ? !valeurdebut.equals(obtient.valeurdebut) : obtient.valeurdebut != null) return false;
        if (valeurfin != null ? !valeurfin.equals(obtient.valeurfin) : obtient.valeurfin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numapprenant;
        result = 31 * result + (datejour != null ? datejour.hashCode() : 0);
        result = 31 * result + numaction;
        result = 31 * result + (valeurdebut != null ? valeurdebut.hashCode() : 0);
        result = 31 * result + (valeurfin != null ? valeurfin.hashCode() : 0);
        return result;
    }
}
