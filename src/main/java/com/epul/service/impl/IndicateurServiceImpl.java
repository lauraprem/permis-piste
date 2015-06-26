package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Indicateur;
import com.epul.repository.IIndicateurDao;
import com.epul.service.IIndicateurService;

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
    public List<Indicateur> getIndicateurForAction(int id) {
        return indicateurDao.getIndicateurFromAction(id);
    }

    @Override
    public boolean addIndicateur(Indicateur indicateur) {
        indicateurDao.save(indicateur);
        return true;
    }

    @Override
    public boolean modifyIndicateur(Indicateur indicateur) {
        indicateurDao.modifyIndicateur(indicateur.getNumaction(), indicateur.getLibindic(), indicateur.getPoids(), indicateur.getNumindic());
        return true;
    }

    @Override
    public List<Indicateur> searchIndicateur(String search) {
        if (Util.isInteger(search)) {
            int s = Integer.valueOf(search);
            return indicateurDao.searchIndicateur(s, s, "%" + search + "%", s);
        }
        return indicateurDao.searchIndicateur("%" + search + "%");
    }
}
