package com.epul.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Pierre on 03/06/2015.
 */
@Entity
public class Apprenant {
    private Integer numapprenant;
    private String nomapprenant;
    private String prenomapprenant;

    @Id
    @Column(name = "NUMAPPRENANT")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getNumapprenant() {
        return numapprenant;
    }

    public void setNumapprenant(Integer numapprenant) {
        this.numapprenant = numapprenant;
    }

    @Basic
    @Column(name = "NOMAPPRENANT")
    public String getNomapprenant() {
        return nomapprenant;
    }

    public void setNomapprenant(String nomapprenant) {
        this.nomapprenant = nomapprenant;
    }

    @Basic
    @Column(name = "PRENOMAPPRENANT")
    public String getPrenomapprenant() {
        return prenomapprenant;
    }

    public void setPrenomapprenant(String prenomapprenant) {
        this.prenomapprenant = prenomapprenant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apprenant apprenant = (Apprenant) o;

        if (numapprenant != apprenant.numapprenant) return false;
        if (nomapprenant != null ? !nomapprenant.equals(apprenant.nomapprenant) : apprenant.nomapprenant != null)
            return false;
        if (prenomapprenant != null ? !prenomapprenant.equals(apprenant.prenomapprenant) : apprenant.prenomapprenant != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numapprenant;
        result = 31 * result + (nomapprenant != null ? nomapprenant.hashCode() : 0);
        result = 31 * result + (prenomapprenant != null ? prenomapprenant.hashCode() : 0);
        return result;
    }
}
