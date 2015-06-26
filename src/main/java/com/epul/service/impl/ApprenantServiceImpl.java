package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Apprenant;
import com.epul.model.Obtient;
import com.epul.repository.IApprenantDao;
import com.epul.repository.IObtientDao;
import com.epul.service.IApprenantService;

@Service
public class ApprenantServiceImpl implements IApprenantService {

	@Autowired
	private IApprenantDao apprenantDAO;
	@Autowired
	private IObtientDao obtientDao;

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
		List<Obtient> obtients = obtientDao.getObtientFromApprenant(id);
		for(Obtient o : obtients){
			obtientDao.delete(o);
		}
		 apprenantDAO.delete(id);
	}

	@Override
	public void addApprenant(Apprenant apprenant) {
		apprenantDAO.save(apprenant);
	}

	@Override
	public void modifyApprenant(Apprenant apprenant) {
		apprenantDAO.save(apprenant);
//		apprenantDAO.modifyApprenant(apprenant.getNomapprenant(), apprenant.getPrenomapprenant(), apprenant.getNumapprenant());
	}

	@Override
	public List<Apprenant> searchApprenant(String search) {
		 if (Util.isInteger(search)) {
	            int s = Integer.valueOf(search);
	            return apprenantDAO.searchApprenant(s, "%" + search + "%", "%" + search + "%");
	        }
	        return apprenantDAO.searchApprenant("%" + search + "%","%" + search + "%");
	}
	
	
}
