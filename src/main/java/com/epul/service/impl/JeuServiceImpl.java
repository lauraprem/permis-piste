package com.epul.service.impl;

import com.epul.model.Jeu;
import com.epul.repository.IJeuDao;
import com.epul.service.IJeuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class JeuServiceImpl implements IJeuService{
    @Autowired
    private IJeuDao jeuDao;

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
        return false;
    }

    @Override
    public boolean addJeu(Jeu jeu) {
        return false;
    }

    @Override
    public boolean modifyJeu(Jeu jeu) {
        return false;
    }
}
