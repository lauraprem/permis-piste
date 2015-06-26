package com.epul.controller;

import com.epul.model.EstAssocie;
import com.epul.service.IEstAssocieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Pierre on 26/06/2015.
 */

@Controller
@RequestMapping(value = "/EstAssocie")
public class EstAssocieController {

    @Autowired
    private IEstAssocieService estAssocieService;

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addMission(@RequestBody EstAssocie estAssocie){
        return estAssocieService.addEstAssocie(estAssocie);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressAction(@RequestBody EstAssocie estAssocie){
        return estAssocieService.suppressEstAssocie(estAssocie);
    }
}
