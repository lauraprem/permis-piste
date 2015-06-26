package com.epul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.epul.model.Obtient;
import com.epul.service.IObtientService;

/**
 * Created by Pierre on 26/06/2015.
 */
@Controller
@RequestMapping(value = "/Obtient")
public class ObtientController {
    @Autowired
    private IObtientService obtientService;

    @RequestMapping(value = "/", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressObtient(@RequestBody Obtient obtient){
        return obtientService.suppressObtient(obtient);
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addObtient(@RequestBody Obtient obtient){
        return obtientService.addObtient(obtient);
    }
}
