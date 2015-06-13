package com.epul.controller;

import com.epul.model.Regle;
import com.epul.service.IRegleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public boolean suppressRegle(int id){
        return false;
    }

    /**
     * Ajouter un regle a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param regle a ajouter
     * @return true si l'ajout a fonctioné false sinon
     */
    public boolean addRegle(Regle regle){
        return false;
    }

    /**
     * Modifie l'regle possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param regle l'apprenant modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyRegle(Regle regle){
        return false;
    }
}
