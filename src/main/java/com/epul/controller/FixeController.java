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

import com.epul.model.Fixe;
import com.epul.service.IFixeService;

@Controller
@RequestMapping(value = "/Fixe")
public class FixeController {
	@Autowired
	private IFixeService fixeService;
	
    @RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Fixe> getAllFixe() {
        return fixeService.getAllFixe();
    }
    
    @RequestMapping(value = "/Mission/{id}", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Fixe> getFixeFromMission(@PathVariable int idMission) {
        return fixeService.getFixeFromMission(idMission);
    }

    @RequestMapping(value = "/Objectif/{id}", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Fixe> getFixeFromObjectif(@PathVariable int idObjectif) {
        return fixeService.getFixeFromObjectif(idObjectif);
    }
    
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void addFixe(@RequestBody Fixe fixe){
        fixeService.addFixe(fixe);
    }


}
