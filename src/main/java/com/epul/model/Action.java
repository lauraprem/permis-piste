package com.epul.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Pierre on 16/06/2015.
 */
@Entity
public class Action {
    private int numaction;
    private Integer actNumaction;
    private String libaction;
    private Integer scoremin;
    private Action actionByActNumaction;
    private Collection<Action> actionsByNumaction;
    private Collection<Appartient> appartientsByNumaction;
    private Collection<EstAssocie> estAssociesByNumaction;
    private Collection<Indicateur> indicateursByNumaction;
    private Collection<Obtient> obtientsByNumaction;
    private Collection<Possede> possedesByNumaction;

    @Id
    @Column(name = "NUMACTION")
    public int getNumaction() {
        return numaction;
    }

    public void setNumaction(int numaction) {
        this.numaction = numaction;
    }

    @Column(name = "ACT_NUMACTION")
    public Integer getActNumaction() {
        return actNumaction;
    }

    public void setActNumaction(Integer actNumaction) {
        this.actNumaction = actNumaction;
    }

    @Basic
    @Column(name = "LIBACTION")
    public String getLibaction() {
        return libaction;
    }

    public void setLibaction(String libaction) {
        this.libaction = libaction;
    }

    @Basic
    @Column(name = "SCOREMIN")
    public Integer getScoremin() {
        return scoremin;
    }

    public void setScoremin(Integer scoremin) {
        this.scoremin = scoremin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        if (numaction != action.numaction) return false;
        if (actNumaction != null ? !actNumaction.equals(action.actNumaction) : action.actNumaction != null)
            return false;
        if (libaction != null ? !libaction.equals(action.libaction) : action.libaction != null) return false;
        if (scoremin != null ? !scoremin.equals(action.scoremin) : action.scoremin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numaction;
        result = 31 * result + (actNumaction != null ? actNumaction.hashCode() : 0);
        result = 31 * result + (libaction != null ? libaction.hashCode() : 0);
        result = 31 * result + (scoremin != null ? scoremin.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "actionByNumaction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Collection<Appartient> getAppartientsByNumaction() {
        return appartientsByNumaction;
    }

    public void setAppartientsByNumaction(Collection<Appartient> appartientsByNumaction) {
        this.appartientsByNumaction = appartientsByNumaction;
    }

    @OneToMany(mappedBy = "actionByNumaction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Collection<EstAssocie> getEstAssociesByNumaction() {
        return estAssociesByNumaction;
    }

    public void setEstAssociesByNumaction(Collection<EstAssocie> estAssociesByNumaction) {
        this.estAssociesByNumaction = estAssociesByNumaction;
    }

    @OneToMany(mappedBy = "actionByNumaction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Collection<Indicateur> getIndicateursByNumaction() {
        return indicateursByNumaction;
    }

    public void setIndicateursByNumaction(Collection<Indicateur> indicateursByNumaction) {
        this.indicateursByNumaction = indicateursByNumaction;
    }

    @OneToMany(mappedBy = "actionByNumaction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Collection<Obtient> getObtientsByNumaction() {
        return obtientsByNumaction;
    }

    public void setObtientsByNumaction(Collection<Obtient> obtientsByNumaction) {
        this.obtientsByNumaction = obtientsByNumaction;
    }

    @OneToMany(mappedBy = "actionByNumaction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Collection<Possede> getPossedesByNumaction() {
        return possedesByNumaction;
    }

    public void setPossedesByNumaction(Collection<Possede> possedesByNumaction) {
        this.possedesByNumaction = possedesByNumaction;
    }
}
