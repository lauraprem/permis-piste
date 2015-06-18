package com.epul.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pierre on 16/06/2015.
 */
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Appartient implements Serializable{
    private int numjeu;
    private int numaction;
    private Action actionByNumaction;
    private Jeu jeuByNumjeu;

    @Id
    @Column(name = "NUMJEU")
    public int getNumjeu() {
        return numjeu;
    }

    public void setNumjeu(int numjeu) {
        this.numjeu = numjeu;
    }

    @Id
    @Column(name = "NUMACTION")
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

        Appartient that = (Appartient) o;

        if (numaction != that.numaction) return false;
        if (numjeu != that.numjeu) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numjeu;
        result = 31 * result + numaction;
        return result;
    }
}
