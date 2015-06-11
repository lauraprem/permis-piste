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
    public List<Objectif> getAllObjectif();
}
