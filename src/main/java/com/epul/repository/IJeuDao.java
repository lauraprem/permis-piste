package com.epul.repository;

import com.epul.model.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IJeuDao extends JpaRepository<Jeu,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Jeu set LIBELLE = :lib where NUMJEU = :id")
    public void modifyJeu(@Param("lib") String libelle, @Param("id") int id);

}
