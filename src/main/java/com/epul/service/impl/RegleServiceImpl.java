package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Possede;
import com.epul.model.Regle;
import com.epul.repository.IPossedeDao;
import com.epul.repository.IRegleDao;
import com.epul.service.IRegleService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class RegleServiceImpl implements IRegleService {

    @Autowired
    private IRegleDao regleDao;
    @Autowired
    private IPossedeDao possedeDao;

    @Override
    public List<Regle> getAllRegle() {
        return regleDao.findAll();
    }

    @Override
    public Regle getRegle(int id) {
        return regleDao.findOne(id);
    }

    @Override
    public boolean suppressRegle(int id) {
    	List<Possede> possedes = possedeDao.getPossedeFromRegle(id);
    	for(Possede p : possedes){
    		possedeDao.delete(p);
    	}
        regleDao.delete(id);
        return true;
    }

    @Override
    public boolean addRegle(Regle regle) {
        regleDao.save(regle);
        return true;
    }

    @Override
    public boolean modifyRegle(Regle regle) {
    	regleDao.modifyRegle(regle.getLibregle(), regle.getScoremin(), regle.getNumregle());
        return true;
    }
    
    @Override
    public List<Regle> getRegleForAction(int id) {
        return regleDao.getRegleForAction(id);
    }

    @Override
    public List<Regle> searchRegle(String search) {
        if (Util.isInteger(search)) {
            int s = Integer.valueOf(search);
            return regleDao.searchRegle(s, "%" + search + "%", s);
        }
        return regleDao.searchRegle("%" + search + "%");
    }


}
