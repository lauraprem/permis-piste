package com.epul.controller;

import java.util.List;

import com.epul.model.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.epul.model.Fixe;
import com.epul.service.IMissionService;

@Controller
@RequestMapping(value = "/Mission")
public class MissionController {
	@Autowired
	private IMissionService missionService;
	
    @RequestMapping(value = "/{idMission}/Objectif", method = RequestMethod.GET, produces ={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
	public List<Fixe> getMissionsObjectif(@PathVariable int idMission){
    	return missionService.getMissionsObjectif(idMission);
    }

    /**
     * Search of an iteration
     * @param search it's an attribute of the search
     * @return the wanted iteration
     */
    @RequestMapping(value = "/Search/{search}", method = RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Mission> searchIndicateur(@PathVariable String search){
        List<Mission> newMission = missionService.searchMission(search);
        return newMission;
    }
}
