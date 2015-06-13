package com.epul.service.impl;

import com.epul.model.Indicateur;
import com.epul.repository.IIndicateurDao;
import com.epul.service.IIndicateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class IndicateurServiceImpl implements IIndicateurService {
    @Autowired
    private IIndicateurDao indicateurDao;

    @Override
    public List<Indicateur> getAllIndicateur() {
        return indicateurDao.findAll();
    }

    @Override
    public Indicateur getIndicateur(int id) {
        return indicateurDao.findOne(id);
    }

    @Override
    public boolean suppressIndicateur(int id) {
        return false;
    }

    @Override
    public boolean addIndicateur(Indicateur indicateur) {
        return false;
    }

    @Override
    public boolean modifyIndicateur(Indicateur indicateur) {
        return false;
    }
}
