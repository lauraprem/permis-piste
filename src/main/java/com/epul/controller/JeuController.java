package com.epul.controller;

import com.epul.model.Jeu;
import com.epul.service.IJeuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public boolean suppressIndicateur(int id){
        return false;
    }

    /**
     * Ajouter un jeu a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param jeu a ajouter
     * @return true si l'ajout a fonctionné false sinon
     */
    public boolean addIndicateur(Jeu jeu){
        return false;
    }

    /**
     * Modifie le jeu possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param jeu le jeu modifié
     * @return true si a modification a eu lieu, false sinon
     */
    public boolean modifyIndicateur(Jeu jeu){
        return false;
    }
}
