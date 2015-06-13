package com.epul.service.impl;

import com.epul.model.Action;
import com.epul.repository.IActionDao;
import com.epul.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class ActionServiceImpl implements IActionService{
    @Autowired
    private IActionDao actionDao;

    @Override
    public List<Action> getAllAction() {
        return actionDao.findAll();
    }

    @Override
    public Action getAction(int id) {
        return actionDao.findOne(id);
    }

    @Override
    public boolean suppressAction(int id) {
        return false;
    }

    @Override
    public boolean addAction(Action action) {
        return false;
    }

    @Override
    public boolean modifyAction(Action action) {
        return false;
    }
}
