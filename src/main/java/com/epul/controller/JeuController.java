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

import com.epul.model.Jeu;
import com.epul.service.IJeuService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Controller
@RequestMapping(value = "/Jeu")
public class JeuController {
    @Autowired
    private IJeuService jeuService;

    /**
     * récupérer la liste de tous les jeux
     * @return liste des jeux
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Jeu> getAllIndicateur() {
        return jeuService.getAllJeu();
    }

    /**
     * Récupérer un jeu grace a son id
     * @param id du jeu a recuperer
     * @return le jeu correspondant a l'id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Jeu getIndicateur(@PathVariable int id){
        return jeuService.getJeu(id);
    }

    /**
     * Supprimer un jeu grace a son id
     * @param id du jeu a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressJeu(@PathVariable int id){
        return jeuService.suppressJeu(id);
    }

    /**
     * Ajouter un jeu a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param jeu a ajouter
     * @return true si l'ajout a fonctionné false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addJeu(@RequestBody Jeu jeu){
        return jeuService.addJeu(jeu);
    }

    /**
     * Modifie le jeu possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param jeu le jeu modifié
     * @return true si a modification a eu lieu, false sinon
     */
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean modifyJeu(@RequestBody Jeu jeu){
        return jeuService.modifyJeu(jeu);
    }
    
    @RequestMapping(value = "/Search/{search}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Jeu> searchAction(@PathVariable String search){
        List<Jeu> newJeu = jeuService.searchJeu(search);
        return newJeu;
    }
}
