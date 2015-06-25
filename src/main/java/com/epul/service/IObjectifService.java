package com.epul.service;

import com.epul.model.Action;
import com.epul.model.Objectif;

import java.util.List;

/**
 * Created by Pierre on 10/06/2015.
 */
public interface IObjectifService {

    /**
     * récupérer la liste de tous les objectifs
     * @return liste des objectifs
     */
    List<Objectif> getAllObjectif();

    /**
     * Récupérer un objectif grace a son id
     * @param id de l'objectif a recuperer
     * @return l'objectif correspondant a l'id
     */
    Objectif getObjectif(int id);

    /**
     * Supprimer un objectif grace a son id
     * @param id de l'objectif a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressObjectif(int id);

    /**
     * Ajouter un objectif a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param objectif a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addObjectif(Objectif objectif);

    /**
     * Modifie l'objectif possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param objectif l'objectif modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyObjectif(Objectif objectif);

    public List<Action> getActionForObjectif(int id);
}
