package com.epul.controller;

import java.util.List;

import com.epul.model.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean suppressMission(@PathVariable int id){
        return missionService.suppressMission(id);
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addMission(@RequestBody Mission mission){
        return missionService.addMission(mission);
    }

    @RequestMapping(value="/", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public boolean modifyMission(@RequestBody Mission mission) {
        return missionService.modifyMission(mission);
    }
}
