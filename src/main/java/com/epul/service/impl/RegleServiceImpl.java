package com.epul.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.model.Regle;
import com.epul.repository.IRegleDao;
import com.epul.service.IRegleService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class RegleServiceImpl implements IRegleService {

    @Autowired
    private IRegleDao regleDao;

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
        regleDao.delete(id);
        return true;
    }

    @Transactional
    @Override
    public boolean addRegle(Regle regle) {
//    	regle.setNumregle(null);
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
}
