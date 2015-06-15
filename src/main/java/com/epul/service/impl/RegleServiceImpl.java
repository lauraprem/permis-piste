package com.epul.service.impl;

import com.epul.model.Regle;
import com.epul.repository.IRegleDao;
import com.epul.service.IRegleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return false;
    }

    @Override
    public boolean addRegle(Regle regle) {
        return false;
    }

    @Override
    public boolean modifyRegle(Regle regle) {
        return false;
    }
}
