package com.epul.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Apprenant;

public interface IApprenantDao extends JpaRepository<Apprenant,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Apprenant set NOMAPPRENANT = :nom, PRENOMAPPRENANT = :prenom where NUMAPPRENANT = :id")
    public void modifyApprenant(@Param("nom") String nom , @Param("prenom") String prenom, @Param("id") int id);
    
    @Query("FROM Apprenant WHERE NUMAPPRENANT= :numapprenant OR NOMAPPRENANT LIKE :nomapprenant OR PRENOMAPPRENANT LIKE :prenomapprenant ")
    public List<Apprenant> searchApprenant(@Param("numapprenant") int numapprenant, @Param("nomapprenant") String nomapprenant, @Param("prenomapprenant") String prenomapprenant);

    @Query("FROM Apprenant WHERE NOMAPPRENANT LIKE :nomapprenant OR PRENOMAPPRENANT LIKE :prenomapprenant ")
    public List<Apprenant> searchApprenant(@Param("nomapprenant") String nomapprenant, @Param("prenomapprenant") String prenomapprenant);

}
