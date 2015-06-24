package com.epul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.epul.model.Regle;
import com.epul.service.IRegleService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Controller
@RequestMapping(value = "/Regle")
public class RegleController {
    @Autowired
    private IRegleService regleService;

    /**
     * récupérer la liste de toutes les regles
     * @return liste des regles
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Regle> getAllRegle() {
        return regleService.getAllRegle();
    }

    /**
     * Récupérer un regle grace a son id
     * @param id de la regle a recuperer
     * @return l'apprenant correspondant a l'id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Regle getIndicateur(@PathVariable int id){
        return regleService.getRegle(id);
    }

    /**
     * Supprimer un regle grace a son id
     * @param id de la regle a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressRegle(@PathVariable int id){
        return regleService.suppressRegle(id);
    }

    /**
     * Ajouter un regle a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param regle a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.POST, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addRegle(@RequestBody Regle regle){
        return regleService.addRegle(regle);
    }

    @RequestMapping(value="/Action/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Regle> getRegleForAction(@PathVariable int id){
        return regleService.getRegleForAction(id);
    }

    /**
     * Modifie l'regle possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param regle l'apprenant modifié
     * @return true si a modification a eu lieu, false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.PUT, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean modifyRegle(@RequestBody Regle regle){
//    	return regleService.addRegle(regle);
    	return regleService.modifyRegle(regle);
    }
}
