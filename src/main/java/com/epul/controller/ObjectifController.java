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
     * récupérer la liste de tous les apprenant
     * @return liste des apprenant
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Objectif> getAllApprenant() {
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

}
