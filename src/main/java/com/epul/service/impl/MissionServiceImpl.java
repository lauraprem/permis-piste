package com.epul.service.impl;

import java.util.List;

import com.epul.Utils.Util;
import com.epul.model.Mission;
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

    @Override
    public List<Mission> searchMission(String search) {
        if (Util.isInteger(search)) {
            int s = Integer.valueOf(search);
            return missionDao.searchMission(s, s, "%" + search + "%");
        }
        return missionDao.searchMission("%" + search + "%");
    }

    @Override
    public List<Mission> getAllMission() {
        return missionDao.findAll();
    }

    @Override
    public boolean suppressMission(int id) {
        missionDao.delete(id);
        return true;
    }

    @Override
    public boolean addMission(Mission mission) {
        missionDao.save(mission);
        return true;
    }

    @Override
    public boolean modifyMission(Mission mission) {
        missionDao.modifyMission(mission.getLibmission(), mission.getNumjeu());
        return true;
    }
}
