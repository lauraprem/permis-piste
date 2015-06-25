package com.epul.repository;

import com.epul.model.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * Created by Pierre on 10/06/2015.
 */
public interface IObjectifDao extends JpaRepository<Objectif, Integer>{
    @Transactional
    @Modifying
    @Query("UPDATE Objectif set LIBOBJECTIF = :lib where NUMOBJECTIF = :id")
    public void modifyObjectif(@Param("lib") String libelle, @Param("id") int id);
}
