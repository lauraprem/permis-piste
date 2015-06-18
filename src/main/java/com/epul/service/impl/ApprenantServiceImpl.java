package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.model.Apprenant;
import com.epul.repository.IApprenantDao;
import com.epul.service.IApprenantService;

@Service
public class ApprenantServiceImpl implements IApprenantService {

	@Autowired
	private IApprenantDao apprenantDAO;

	public void setApprenantDAO(IApprenantDao apprenantDAO) {
		this.apprenantDAO = apprenantDAO;
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		return apprenantDAO.findAll();
	}

	@Override
	public Apprenant getApprenant(int id) {
		return apprenantDAO.findOne(id);
	}

	@Override
	public void suppressApprenant(int id) {
		 apprenantDAO.delete(id);
	}

	@Override
	public void addOrModifyApprenant(Apprenant apprenant) {
		apprenant.setNumapprenant(null);
		apprenantDAO.save(apprenant);
	}
}
