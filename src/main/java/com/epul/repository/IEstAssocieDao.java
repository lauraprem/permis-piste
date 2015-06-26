package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.EstAssocie;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IEstAssocieDao  extends JpaRepository<EstAssocie, Integer> {

    @Query("FROM EstAssocie WHERE NUMACTION= :numaction ")
    public List<EstAssocie> getEstAssocieFromAction( @Param("numaction") int numaction);
    
    @Query("FROM EstAssocie WHERE NUMOBJECTIF= :numobjectif ")
    public List<EstAssocie> getEstAssocieFromObjectif(@Param("numobjectif") int numobjectif);
}
