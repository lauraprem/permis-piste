package com.epul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epul.Utils.Util;
import com.epul.model.Action;
import com.epul.model.Appartient;
import com.epul.model.EstAssocie;
import com.epul.model.Indicateur;
import com.epul.model.Obtient;
import com.epul.model.Possede;
import com.epul.repository.IActionDao;
import com.epul.repository.IAppartientDao;
import com.epul.repository.IEstAssocieDao;
import com.epul.repository.IIndicateurDao;
import com.epul.repository.IObtientDao;
import com.epul.repository.IPossedeDao;
import com.epul.service.IActionService;

/**
 * Created by Pierre on 13/06/2015.
 */
@Service
public class ActionServiceImpl implements IActionService {
	@Autowired
	private IActionDao actionDao;
	@Autowired
	private IEstAssocieDao estAssocieDao;
	@Autowired
	private IAppartientDao appartientDao;
	@Autowired
	private IPossedeDao possedeDao;
	@Autowired
	private IObtientDao obtientDao;
	@Autowired
	private IIndicateurDao indicateurDao;

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
		List<EstAssocie> estAssocies = estAssocieDao.getEstAssocieFromAction(id);
		List<Appartient> appartients = appartientDao.getAppartientFromAction(id);
		List<Possede> possedes = possedeDao.getPossedeFromAction(id);
		List<Obtient> obtients = obtientDao.getObtientFromAction(id);
		List<Indicateur> indicateurs = indicateurDao.getIndicateurFromAction(id);
		List<Action> actions = actionDao.getActNumAction(id);
		for (EstAssocie e : estAssocies) {
			estAssocieDao.delete(e);
		}
		for (Appartient a : appartients) {
			appartientDao.delete(a);
		}
		for (Possede p : possedes) {
			possedeDao.delete(p);
		}
		for (Obtient o : obtients) {
			obtientDao.delete(o);
		}
		for (Indicateur i : indicateurs) {
			indicateurDao.delete(i);
		}
		for (Action a : actions){
			a.setActNumaction(null);
			actionDao.save(a);
		}
		actionDao.delete(id);
		return true;
	}

	@Override
	public boolean addAction(Action action) {
		actionDao.save(action);
		return true;
	}

	@Override
	public boolean modifyAction(Action action) {
		if (action.getActNumaction() == null) {
			actionDao.modifyAction(action.getLibaction(), action.getScoremin(), action.getNumaction());
		} else {
			actionDao.modifyAction(action.getActNumaction(), action.getLibaction(), action.getScoremin(), action.getNumaction());
		}
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
