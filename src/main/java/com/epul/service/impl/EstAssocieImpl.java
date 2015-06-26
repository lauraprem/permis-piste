package com.epul.service.impl;

import com.epul.model.EstAssocie;
import com.epul.repository.IEstAssocieDao;
import com.epul.service.IEstAssocieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pierre on 26/06/2015.
 */
@Service
public class EstAssocieImpl implements IEstAssocieService {
    @Autowired
    private IEstAssocieDao estAssocieDao;

    @Override
    public boolean addEstAssocie(EstAssocie association) {
        estAssocieDao.save(association);
        return true;
    }

    @Override
    public boolean suppressEstAssocie(EstAssocie association) {
        estAssocieDao.delete(association);
        return true;
    }
}
