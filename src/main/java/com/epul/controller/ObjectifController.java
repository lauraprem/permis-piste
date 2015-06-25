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
     * Ajouter un objectif a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param objectif a ajouter
     * @return true si l'ajout a fonctionné false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addObjectif(@RequestBody Objectif objectif){
        return objectifService.addObjectif(objectif);
    }

    /**
     * Supprimer un objectif grace a son id
     * @param id de l'objectif a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressObjectif(@PathVariable int id){
        return objectifService.suppressObjectif(id);
    }

    /**
     * Modifie l'objectif possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param objectif l'objectif modifié
     * @return true si a modification a eu lieu, false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean modifyObjectif(Objectif objectif){
        return objectifService.modifyObjectif(objectif);
    }
}
