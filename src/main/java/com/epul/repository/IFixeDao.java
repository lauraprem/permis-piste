package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Fixe;

public interface IFixeDao extends JpaRepository<Fixe, Integer>{
	   @Query("FROM Fixe WHERE NUMMISSION= :nummission")
	    public List<Fixe> getFixeFromMission( @Param("nummission") int nummission);
	    
	    @Query("FROM Fixe WHERE NUMOBJECTIF= :numobjectif ")
	    public List<Fixe> getFixeFromObjectif(@Param("numobjectif") int numobjectif);
}
