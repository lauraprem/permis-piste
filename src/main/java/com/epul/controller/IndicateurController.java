package com.epul.controller;

import com.epul.model.Action;
import com.epul.model.Indicateur;
import com.epul.service.IIndicateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
@Controller
@RequestMapping(value = "/Indicateur")
public class IndicateurController {

    @Autowired
    private IIndicateurService indicateurService;

    /**
     * récupérer la liste de tous les indicateurs
     * @return liste des indicateurs
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Indicateur> getAllIndicateur() {
        return indicateurService.getAllIndicateur();
    }

    /**
     * Récupérer un indicateur grace a son id
     * @param id de l'indicateur a recuperer
     * @return l'indicateur correspondant a l'id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Indicateur getIndicateur(@PathVariable int id){
        return indicateurService.getIndicateur(id);
    }


    @RequestMapping(value="/Action/{id}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Indicateur> getIndicateurForAction(@PathVariable int id){
        return indicateurService.getIndicateurForAction(id);
    }


    /**
     * Supprimer un indicateur grace a son id
     * @param id de l'indicateur a supprimer
     * @return true si la suppression a fonctionné, false sinon
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressIndicateur(@PathVariable int id){
        return indicateurService.suppressIndicateur(id);
    }

    /**
     * Ajouter un indicateur a la base de données (l'id est mis en place selon le dernier ID en BDD)
     * @param indicateur a ajouter
     * @return true si l'ajout a fonctionné false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addIndicateur(@RequestBody Indicateur indicateur){
        return indicateurService.addIndicateur(indicateur);
    }

    /**
     * Modifie l'indicateur possedant cet ID avec les nouvelles informations
     * Si l'ID n'existe pas en BDD, on ne fait rien
     * @param indicateur l'indicateur modifié
     * @return true si a modification a eu lieu, false sinon
     */
    @RequestMapping(value="/", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean modifyIndicateur(Indicateur indicateur){
        return indicateurService.modifyIndicateur(indicateur);
    }

    /**
     * Search of an iteration
     * @param search it's an attribute of the search
     * @return the wanted iteration
     */
    @RequestMapping(value = "/search/{search}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Indicateur> searchIndicateur(@PathVariable String search){
        List<Indicateur> newIndicateur = indicateurService.searchIndicateur(search);
        return newIndicateur;
    }
}
