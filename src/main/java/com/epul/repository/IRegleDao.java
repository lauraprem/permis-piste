package com.epul.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Regle;


/**
 * Created by Pierre on 13/06/2015.
 */
public interface IRegleDao extends JpaRepository<Regle,Integer> {
    @Query("FROM Regle as r, Possede as p WHERE p.numaction= :numaction AND p.numregle = r.numregle")
    public List<Regle> getRegleForAction(@Param("numaction") int numAction);

	
	@Transactional
	@Modifying
    @Query("UPDATE Regle as r set  LIBREGLE = :lib, SCOREMIN = :scoremin where NUMREGLE = :id")
    public void modifyRegle( @Param("lib") String lib,@Param("scoremin") int scoremin,@Param("id") int id);

    @Query("FROM Regle WHERE NUMREGLE= :numregle OR LIBREGLE= :libregle OR SCOREMIN= :scoremin ")
    public List<Regle> searchRegle(@Param("numregle") int numregle, @Param("libregle") String libregle, @Param("scoremin") int scoremin);

    @Query("FROM Regle WHERE LIBREGLE LIKE :libregle")
    public List<Regle> searchRegle( @Param("libregle") String libregle);

}
 
