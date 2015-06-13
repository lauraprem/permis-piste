package com.epul.controller;

/**
 * Created by Pierre on 10/06/2015.
 */

import com.epul.model.Objectif;
import com.epul.service.IObjectifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/Objectif")
public class ObjectifController {

    @Autowired
    private IObjectifService objectifService;

    /**
     * récupérer la liste de tous les objectif
     * @return liste des objectif
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Objectif> getAllObjectif() {
        return objectifService.getAllObjectif();
    }

    /**
     * Récupérer un objectif grace a son id
     * @param id de l'objectif a recuperer
     * @return l'objectif correspondant a l'id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Objectif getObjectif(@PathVariable int id){
        return objectifService.getObjectif(id);
    }

    /**
     * Supprimer un objectif grace a son id
     * @param id de l'objectif a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    public boolean suppressObjectif(int id){
        return false;
    }

    /**
     * Ajouter un objectif a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param objectif a ajouter
     * @return true si l'ajout a fonctionné false sinon
     */
    public boolean addObjectif(Objectif objectif){
        return false;
    }

    /**
     * Modifie l'objectif possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param objectif l'objectif modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyObjectif(Objectif objectif){
        return false;
    }

}
