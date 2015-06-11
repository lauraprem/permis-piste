package com.epul.service;

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
}
