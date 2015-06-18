package com.epul.model;

import javax.persistence.*;

/**
 * Created by Pierre on 16/06/2015.
 */
@Entity
@Table(name = "est_associe", schema = "", catalog = "permispiste")
@IdClass(EstAssociePK.class)
public class EstAssocie {
    private int numaction;
    private int numobjectif;
    private Action actionByNumaction;
    private Objectif objectifByNumobjectif;

    @Id
    @Column(name = "NUMACTION")
    public int getNumaction() {
        return numaction;
    }

    public void setNumaction(int numaction) {
        this.numaction = numaction;
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

        EstAssocie that = (EstAssocie) o;

        if (numaction != that.numaction) return false;
        if (numobjectif != that.numobjectif) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numaction;
        result = 31 * result + numobjectif;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "NUMACTION", referencedColumnName = "NUMACTION", nullable = false, insertable=false, updatable = false)
    public Action getActionByNumaction() {
        return actionByNumaction;
    }

    public void setActionByNumaction(Action actionByNumaction) {
        this.actionByNumaction = actionByNumaction;
    }

    @ManyToOne
    @JoinColumn(name = "NUMOBJECTIF", referencedColumnName = "NUMOBJECTIF", nullable = false, insertable=false, updatable = false)
    public Objectif getObjectifByNumobjectif() {
        return objectifByNumobjectif;
    }

    public void setObjectifByNumobjectif(Objectif objectifByNumobjectif) {
        this.objectifByNumobjectif = objectifByNumobjectif;
    }
}
