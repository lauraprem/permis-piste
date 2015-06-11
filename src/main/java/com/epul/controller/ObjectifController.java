package com.epul.controller;

/**
 * Created by Pierre on 10/06/2015.
 */

import com.epul.model.Objectif;
import com.epul.service.IObjectifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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

}
