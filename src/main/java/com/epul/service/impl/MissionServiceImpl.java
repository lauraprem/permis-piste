package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.model.Fixe;
import com.epul.repository.IMissionDao;
import com.epul.service.IMissionService;

@Service
public class MissionServiceImpl implements IMissionService{

	@Autowired
	private IMissionDao missionDao;

	@Override
	public List<Fixe> getMissionsObjectif(int idMission) {
		return missionDao.missionObjectif(idMission);
	}
	
	 
	
}
