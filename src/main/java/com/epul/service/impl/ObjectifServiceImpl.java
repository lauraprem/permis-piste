package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.EstAssocie;
import com.epul.model.Fixe;
import com.epul.model.Objectif;
import com.epul.repository.IEstAssocieDao;
import com.epul.repository.IFixeDao;
import com.epul.repository.IObjectifDao;
import com.epul.service.IObjectifService;

/**
 * Created by Pierre on 10/06/2015.
 */
@Service
public class ObjectifServiceImpl implements IObjectifService {
    @Autowired
    private IObjectifDao objectifDao;
    @Autowired
    private IFixeDao fixeDao;
    @Autowired
    private IEstAssocieDao estAssocieDao;

    @Override
    public List<Objectif> getAllObjectif() {
        return objectifDao.findAll();
    }

    /**
     * Récupérer un objectif grace a son id
     * @param id de l'objectif a recuperer
     * @return l'objectif correspondant a l'id
     */
    public Objectif getObjectif(int id){
        return objectifDao.findOne(id);
    }

    @Override
    public boolean suppressObjectif(int id) {
    	List<Fixe> fixes = fixeDao.getFixeFromObjectif(id);
    	List<EstAssocie> estAssocies = estAssocieDao.getEstAssocieFromObjectif(id);
    	for(Fixe f : fixes){
    		fixeDao.delete(f);
    	}
    	for(EstAssocie e : estAssocies){
    		estAssocieDao.delete(e);
    	}
        objectifDao.delete(id);
        return true;
    }

    @Override
    public boolean addObjectif(Objectif objectif) {
        objectifDao.save(objectif);
        return true;
    }

    @Override
    public boolean modifyObjectif(Objectif objectif)
    {
        objectifDao.modifyObjectif(objectif.getLibobjectif(), objectif.getNumobjectif());
        return true;
    }

    @Override
    public List<EstAssocie> getActionForObjectif(int id) {
        return objectifDao.getActionForOneObjectif(id);
    }

    @Override
    public List<Objectif> searchObjectif(String search) {
        if (Util.isInteger(search)) {
            int s = Integer.valueOf(search);
            return objectifDao.searchObjectif(s, "%" + search + "%");
        }
        return objectifDao.searchObjectif("%" + search + "%");
    }
}
