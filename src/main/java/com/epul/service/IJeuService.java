package com.epul.service;

import java.util.List;

import com.epul.model.Jeu;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IJeuService {
    /**
     * récupérer la liste de tous les jeux
     * @return liste des jeux
     */
    List<Jeu> getAllJeu();

    /**
     * Récupérer un jeu grace a son id
     * @param id du jeu a recuperer
     * @return l'objectif correspondant a l'id
     */
    Jeu getJeu(int id);

    /**
     * Supprimer un jeu grace a son id
     * @param id du jeu a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressJeu(int id);

    /**
     * Ajouter un jeu a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param jeu a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addJeu(Jeu jeu);

    /**
     * Modifie le jeu possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param jeu le jeu modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyJeu(Jeu jeu);
    
    public List<Jeu> searchJeu(String search);
}
