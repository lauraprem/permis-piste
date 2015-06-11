package com.epul.service.impl;

import com.epul.model.Objectif;
import com.epul.repository.IObjectifDao;
import com.epul.service.IObjectifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pierre on 10/06/2015.
 */
@Service
public class ObjectifServiceImpl implements IObjectifService {
    @Autowired
    private IObjectifDao objectifDao;

    @Override
    public List<Objectif> getAllObjectif() {
        return objectifDao.findAll();
    }
}
