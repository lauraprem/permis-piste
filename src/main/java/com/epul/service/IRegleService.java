package com.epul.service;

import com.epul.model.Regle;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IRegleService {
    /**
     * récupérer la liste de toutes les regles
     * @return liste des regles
     */
    public List<Regle> getAllRegle();

    /**
     * Récupérer un regle grace a son id
     * @param id de la regle a recuperer
     * @return la regle correspondant a l'id
     */
    public Regle getRegle(int id);

    /**
     * Supprimer un regle grace a son id
     * @param id de l'regle a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressRegle(int id);

    /**
     * Ajouter un regle a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param regle a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addRegle(Regle regle);

    /**
     * Modifie l'regle possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param regle l'apprenant modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyRegle(Regle regle);
    

    public List<Regle> getRegleForAction(int id);
}
