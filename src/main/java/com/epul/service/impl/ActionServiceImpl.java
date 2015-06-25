package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Action;
import com.epul.repository.IActionDao;
import com.epul.service.IActionService;

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
        actionDao.delete(id);
        return false;
    }

    @Override
    public boolean addAction(Action action) {
        actionDao.save(action);
        return true;
    }

    @Override
    public boolean modifyAction(Action action) {
        actionDao.modifyAction(action.getActNumaction(), action.getLibaction(), action.getScoremin(), action.getNumaction());
        return true;
    }

	@Override
	public List<Action> searchAction(String search) {
		 if (Util.isInteger(search)) {
	            int s = Integer.valueOf(search);
	            return actionDao.searchAction(s, s, search, s);
	        }
	        return actionDao.searchAction(search);
	}
    
    
}
