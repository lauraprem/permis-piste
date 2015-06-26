package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.model.Fixe;
import com.epul.repository.IFixeDao;
import com.epul.service.IFixeService;

@Service
public class FixeServiceImpl implements IFixeService{

	@Autowired
	private IFixeDao fixeDao;
	
	@Override
	public List<Fixe> getAllFixe() {
		return fixeDao.findAll();
	}

	@Override
	public List<Fixe> getFixeFromMission(int idMission) {
		return fixeDao.getFixeFromMission(idMission);
	}

	@Override
	public List<Fixe> getFixeFromObjectif(int idObjectif) {
		return fixeDao.getFixeFromObjectif(idObjectif);
	}

	@Override
	public void addFixe(Fixe fixe) {
		fixeDao.save(fixe);
		
	}

}
