package com.epul.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by Pierre on 03/06/2015.
 */
@Entity
public class Jeu {
	private int numjeu;
	private String libellejeu;
	private List<Mission> missionJeu;

	@Id
	@Column(name = "NUMJEU")
	public int getNumjeu() {
		return numjeu;
	}

	public void setNumjeu(int numjeu) {
		this.numjeu = numjeu;
	}

	@Basic
	@Column(name = "LIBELLEJEU")
	public String getLibellejeu() {
		return libellejeu;
	}

	public void setLibellejeu(String libellejeu) {
		this.libellejeu = libellejeu;
	}
	
	

    @OneToMany(mappedBy="jeuByNumjeu", fetch=FetchType.EAGER)
    public List<Mission> getMissionJeu(){
        return missionJeu;
    }

	public void setMissions(List<Mission> missions) {
		this.missionJeu = missions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Jeu jeu = (Jeu) o;

		if (numjeu != jeu.numjeu)
			return false;
		if (libellejeu != null ? !libellejeu.equals(jeu.libellejeu) : jeu.libellejeu != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = numjeu;
		result = 31 * result + (libellejeu != null ? libellejeu.hashCode() : 0);
		return result;
	}
}
