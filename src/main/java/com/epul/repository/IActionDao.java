package com.epul.repository;

import com.epul.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionDao extends JpaRepository<Action,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Action set  ACTNUMACTION = :actnumaction, LIBACTION = :lib, SCOREMIN = :scoremin where NUMACTION = :id")
    public void modifyAction(@Param("actnumaction") int numaction , @Param("lib") String lib,@Param("scoremin") int scoremin,@Param("id") int id);
}
