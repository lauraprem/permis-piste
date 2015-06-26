package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Appartient;
import com.epul.model.Jeu;
import com.epul.model.Mission;
import com.epul.model.Obtient;
import com.epul.repository.IAppartientDao;
import com.epul.repository.IJeuDao;
import com.epul.repository.IObtientDao;
import com.epul.service.IJeuService;
import com.epul.service.IMissionService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class JeuServiceImpl implements IJeuService{
    @Autowired
    private IJeuDao jeuDao;
    @Autowired
    private IMissionService missionService;
    @Autowired
    private IAppartientDao appartientDao;
    @Autowired
    private IObtientDao obtientDao;

    @Override
    public List<Jeu> getAllJeu() {
        return jeuDao.findAll();
    }

    @Override
    public Jeu getJeu(int id) {
        return jeuDao.findOne(id);
    }

    @Override
    public boolean suppressJeu(int id) {
    	List<Mission> missions = missionService.getMissionFromJeu(id);
    	List<Appartient> appartients = appartientDao.getAppartientFromJeu(id);
    	List<Obtient> obtients = obtientDao.getObtientFromJeu(id);
    	for(Mission m : missions){
    		missionService.suppressMission(m.getNummission());
    	}
    	for(Appartient a : appartients){
    		appartientDao.delete(a);
    	}
    	for(Obtient o : obtients){
    		obtientDao.delete(o);
    	}
        jeuDao.delete(id);
        return true;
    }

    @Override
    public boolean addJeu(Jeu jeu) {
        jeuDao.save(jeu);
        return true;
    }

    @Override
    public boolean modifyJeu(Jeu jeu) {
        jeuDao.modifyJeu(jeu.getLibellejeu(), jeu.getNumjeu());
        return true;
    }

	@Override
	public List<Jeu> searchJeu(String search) {
		   if (Util.isInteger(search)) {
	            int s = Integer.valueOf(search);
	            return jeuDao.searchJeu(s, "%" + search + "%");
	        }
	        return jeuDao.searchJeu("%" + search + "%");
	}
    
    
}
