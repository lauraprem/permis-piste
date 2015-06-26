package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Obtient;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IObtientDao extends JpaRepository<Obtient, Integer> {

	   @Query("FROM Obtient WHERE NUMACTION= :numaction ")
	    public List<Obtient> getObtientFromAction(@Param("numaction") int numaction);
	    
	    @Query("FROM Obtient WHERE NUMAPRENANT= :numapprenant ")
	    public List<Obtient> getObtientFromApprenant(@Param("numapprenant") int numapprenant);
}
