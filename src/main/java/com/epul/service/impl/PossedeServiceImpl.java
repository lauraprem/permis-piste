package com.epul.service.impl;

import com.epul.model.Possede;
import com.epul.repository.IPossedeDao;
import com.epul.service.IPossedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pierre on 26/06/2015.
 */
@Service
public class PossedeServiceImpl implements IPossedeService {
    @Autowired
    private IPossedeDao possedeDao;

    @Override
    public boolean suppressPossede(Possede possede) {
        possedeDao.delete(possede);
        return true;
    }

    @Override
    public boolean addPossede(Possede possede) {
        possedeDao.save(possede);
        return true;
    }
}
