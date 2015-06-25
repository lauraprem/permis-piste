package com.epul.service;

import java.util.List;

import com.epul.model.Action;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionService {
    /**
     * récupérer la liste de toutes les actions
     * @return liste des actions
     */
    List<Action> getAllAction();

    /**
     * Récupérer une action grace a son id
     * @param id du action a recuperer
     * @return l'objectif correspondant a l'id
     */
    Action getAction(int id);

    /**
     * Supprimer une action grace a son id
     * @param id du action a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressAction(int id);

    /**
     * Ajouter une action a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param action a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addAction(Action action);

    /**
     * Modifie l'action possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param action l'action modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyAction(Action action);
    
    List<Action> searchAction(String search);
}
