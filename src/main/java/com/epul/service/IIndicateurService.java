package com.epul.service;

import com.epul.model.Indicateur;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IIndicateurService {
    /**
     * récupérer la liste de tous les indicateurs
     * @return liste des indicateurs
     */
    List<Indicateur> getAllIndicateur();

    /**
     * Récupérer un indicateur grace a son id
     * @param id de l'indicateur a recuperer
     * @return l'objectif correspondant a l'id
     */
    Indicateur getIndicateur(int id);

    /**
     * Supprimer un indicateur grace a son id
     * @param id de l'indicateur a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressIndicateur(int id);

    List<Indicateur> getIndicateurForAction(int id);

    /**
     * Ajouter un indicateur a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param indicateur a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addIndicateur(Indicateur indicateur);

    /**
     * Modifie l'indicateur possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param indicateur l'indicateur modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyIndicateur(Indicateur indicateur);

    List<Indicateur> searchIndicateur(String search);
}
