package com.epul.service;

import java.util.List;

import com.epul.model.Fixe;
import com.epul.model.Mission;

public interface IMissionService {
	
	public List<Fixe> getMissionsObjectif(int idMission);

    public List<Mission> searchMission(String search);

}
