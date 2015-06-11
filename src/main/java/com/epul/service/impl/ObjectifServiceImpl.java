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

    /**
     * Récupérer un objectif grace a son id
     * @param id de l'objectif a recuperer
     * @return l'objectif correspondant a l'id
     */
    public Objectif getObjectif(int id){
        return objectifDao.findOne(id);
    }
}
