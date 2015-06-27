package com.epul.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Jeu;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IJeuDao extends JpaRepository<Jeu,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Jeu set LIBELLE = :lib where NUMJEU = :id")
    public void modifyJeu(@Param("lib") String libelle, @Param("id") int id);
    
    @Query("FROM Jeu WHERE NUMJEU= :numjeu OR LIBELLEJEU LIKE :libellejeu ")
    public List<Jeu> searchJeu(@Param("numjeu") int numjeu, @Param("libellejeu") String libellejeu);

    @Query("FROM Jeu WHERE LIBELLEJEU LIKE :libellejeu ")
    public List<Jeu> searchJeu( @Param("libellejeu") String libellejeu);

}
