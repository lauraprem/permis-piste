package com.epul.service.impl;

import com.epul.model.Obtient;
import com.epul.repository.IObtientDao;
import com.epul.service.IObtientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pierre on 26/06/2015.
 */
@Service
public class ObtientServiceImpl implements IObtientService {
    @Autowired
    private IObtientDao obtientDao;

    @Override
    public boolean suppressObtient(Obtient obtient) {
        obtientDao.delete(obtient);
        return true;
    }

    @Override
    public boolean addObtient(Obtient obtient) {
        obtientDao.save(obtient);
        return true;
    }
}
