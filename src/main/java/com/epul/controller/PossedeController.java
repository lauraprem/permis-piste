package com.epul.controller;

import com.epul.model.Possede;
import com.epul.service.IPossedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Pierre on 26/06/2015.
 */
@Controller
@RequestMapping(value = "/Possede")
public class PossedeController {
    @Autowired
    private IPossedeService possedeService;

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addMission(@RequestBody Possede possede){
        return possedeService.addPossede(possede);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressAction(@RequestBody Possede possede){
        return possedeService.suppressPossede(possede);
    }
}
