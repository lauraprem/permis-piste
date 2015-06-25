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
	public void suppressApprenant(int id);
	
	/**
	 * Ajouter un apprenant a la base de données, modifie si l'id exite déjà
	 * @param apprenant a ajouter
	 * @return true si l'ajout a fonctioné false sinon
	 */
	public void addApprenant(Apprenant apprenant);
	
	public void modifyApprenant(Apprenant apprenant);
	
	List<Apprenant> searchApprenant(String search);
	
}
