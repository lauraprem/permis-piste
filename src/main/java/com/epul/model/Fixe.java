package com.epul.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by Pierre on 03/06/2015.
 */
@Entity
@IdClass(FixePK.class)
public class Fixe {
    private int nummission;
    private int numobjectif;
    private Objectif objectif;
    private Mission mission;
//
//    public Objectif getObjectif() {
//		return objectif;
//	}
//
//	public void setObjectif(Objectif objectif) {
//		this.objectif = objectif;
//	}
//
//	public Mission getMission() {
//		return mission;
//	}
//
//	public void setMission(Mission mission) {
//		this.mission = mission;
//	}

	@Id
    @Column(name = "NUMMISSION")
    public int getNummission() {
        return nummission;
    }

    public void setNummission(int nummission) {
        this.nummission = nummission;
    }

    @Id
    @Column(name = "NUMOBJECTIF")
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

        Fixe fixe = (Fixe) o;

        if (nummission != fixe.nummission) return false;
        if (numobjectif != fixe.numobjectif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nummission;
        result = 31 * result + numobjectif;
        return result;
    }
}
