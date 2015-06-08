package com.epul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.epul.model.Apprenant;
import com.epul.service.IApprenantService;

@Controller
@RequestMapping(value = "/Apprenant")
public class ApprenantController {

	@Autowired
	private IApprenantService apprenantService;

	/**
	 * récupérer la liste de tous les apprenant
	 * @return liste des apprenant
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET, produces ={"application/json"})
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Apprenant> getAllApprenant() {
		System.out.println("Je passe dans le controleur");
		return apprenantService.getAllApprenant();
	}

	/**
	 * Récupérer un apprenant grace a son id
	 * @param id de l'apprenant a recuperer
	 * @return l'apprenant correspondant a l'id
	 */
	public Apprenant getApprenant(int id){
		return null;
	}

	/**
	 * Supprimer un apprenant grace a son id
	 * @param id de l'apprenant a supprimer
	 * @return true si la suppression a fonctionné, false sinon
	 */
	public boolean suppressApprenant(int id){
		return false;
	}

	/**
	 * Ajouter un apprenant a la base de données (l'id est mis en place selon le dernier ID en BDD)
	 * @param apprenant a ajouter
	 * @return true si l'ajout a fonctioné false sinon
	 */
	public boolean addApprenant(Apprenant apprenant){
		return false;
	}

	/**
	 * Modifie l'apprenant possedant cet ID avec les nouvelles informations
	 * Si l'ID n'existe pas en BDD, on ne fait rien
	 * @param apprenant l'apprenant modifié
	 * @return true si a modification a eu lieu, false sinon
	 */
	public boolean modifyApprenant(Apprenant apprenant){
		return false;
	}
}
