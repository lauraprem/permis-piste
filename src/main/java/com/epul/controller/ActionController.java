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

import com.epul.model.Action;
import com.epul.service.IActionService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Controller
@RequestMapping(value = "/Action")
public class ActionController {
    @Autowired
    private IActionService actionService;

    /**
     * récupérer la liste de toutes les actions
     * @return liste des actions
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Action> getAllAction() {
        return actionService.getAllAction();
    }

    /**
     * Récupérer un action grace a son id
     * @param id de l'action a recuperer
     * @return l'apprenant correspondant a l'id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Action getAction(@PathVariable int id){
        return actionService.getAction(id);
    }

    /**
     * Supprimer un action grace a son id
     * @param id de l'action a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressAction(@PathVariable int id){
        return actionService.suppressAction(id);
    }

    /**
     * Ajouter un action a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param action a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addAction(@RequestBody Action action){
        return actionService.addAction(action);
    }

    /**
     * Modifie l'action possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param action l'action modifié
     * @return true si a modification a eu lieu, false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.PUT)
     @ResponseBody
     @ResponseStatus(HttpStatus.OK)
     public boolean modifyAction(@RequestBody Action action){
        return actionService.modifyAction(action);
    }
    
    @RequestMapping(value = "/Search/{search}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Action> searchAction(@PathVariable String search){
        List<Action> newAction = actionService.searchAction(search);
        return newAction;
    }
    
}
