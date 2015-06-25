package com.epul.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Pierre on 03/06/2015.
 */
@Entity
public class Mission {
    private int nummission;
    private int numjeu;
    private String libmission;
    @JsonIgnore
    private Jeu jeuByNumjeu;

    @Id
    @Column(name = "NUMMISSION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNummission() {
        return nummission;
    }

    public void setNummission(int nummission) {
        this.nummission = nummission;
    }

    @Basic
    @Column(name = "NUMJEU")
    public int getNumjeu() {
        return numjeu;
    }

    public void setNumjeu(int numjeu) {
        this.numjeu = numjeu;
    }

    @Basic
    @Column(name = "LIBMISSION")
    public String getLibmission() {
        return libmission;
    }

    public void setLibmission(String libmission) {
        this.libmission = libmission;
    }


    @ManyToOne
    @JoinColumn(name = "NUMJEU", insertable = false, updatable = false)
    public Jeu getJeuByNumjeu(){
        return jeuByNumjeu;
    }

    public void setJeuByNumjeu(Jeu jeu){
        this.jeuByNumjeu = jeu;
    }

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mission mission = (Mission) o;

        if (nummission != mission.nummission) return false;
        if (numjeu != mission.numjeu) return false;
        if (libmission != null ? !libmission.equals(mission.libmission) : mission.libmission != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nummission;
        result = 31 * result + numjeu;
        result = 31 * result + (libmission != null ? libmission.hashCode() : 0);
        return result;
    }

}
