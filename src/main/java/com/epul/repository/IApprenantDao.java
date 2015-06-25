package com.epul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epul.model.Apprenant;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IApprenantDao extends JpaRepository<Apprenant,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Apprenant set NOMAPPRENANT = :nom, PRENOMAPPRENANT = :prenom where NUMAPPRENANT = :id")
    public void modifyApprenant(@Param("nom") String nom , @Param("prenom") String prenom, @Param("id") int id);

}
