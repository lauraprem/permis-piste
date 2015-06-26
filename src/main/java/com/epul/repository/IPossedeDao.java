package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Possede;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IPossedeDao  extends JpaRepository<Possede, Integer> {
	   @Query("FROM Possede WHERE NUMACTION= :numaction ")
	    public List<Possede> getPossedeFromAction( @Param("numaction") int numaction);
	    
	    @Query("FROM Possede WHERE NUMREGLE= :numregle ")
	    public List<Possede> getPossedeFromRegle(@Param("numregle") int numregle);
}
