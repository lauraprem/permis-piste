package com.epul.service;

import java.util.List;

import com.epul.model.Apprenant;

public interface IApprenantService {

	/**
	 * récupérer la liste de tous les apprenant
	 * @return liste des apprenant
	 */
	public List<Apprenant> getAllApprenant();
	
	/**
	 * Récupérer un apprenant grace a son id
	 * @param id de l'apprenant a recuperer
	 * @return l'apprenant correspondant a l'id
	 */
	public Apprenant getApprenant(int id);
	
	/**
	 * Supprimer un apprenant grace a son id
	 * @param id de l'apprenant a supprimer
	 * @return true si la suppression a fonctionné, false sinon
	 */
	public boolean suppressApprenant(int id);
	
	/**
	 * Ajouter un apprenant a la base de données (l'id est mis en place selon le dernier ID en BDD)
	 * @param apprenant a ajouter
	 * @return true si l'ajout a fonctioné false sinon
	 */
	public boolean addApprenant(Apprenant apprenant);
	
	/**
	 * Modifie l'apprenant possedant cet ID avec les nouvelles informations
	 * Si l'ID n'existe pas en BDD, on ne fait rien
	 * @param apprenant l'apprenant modifié
	 * @return true si a modification a eu lieu, false sinon
	 */
	public boolean modifyApprenant(Apprenant apprenant);
	
}
