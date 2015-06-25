package com.epul.repository;

import com.epul.model.Action;
import com.epul.model.EstAssocie;
import com.epul.model.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Pierre on 10/06/2015.
 */
public interface IObjectifDao extends JpaRepository<Objectif, Integer>{
    @Transactional
    @Modifying
    @Query("UPDATE Objectif set LIBOBJECTIF = :lib where NUMOBJECTIF = :id")
    public void modifyObjectif(@Param("lib") String libelle, @Param("id") int id);

    @Query("FROM EstAssocie as e, Action as a, Objectif as o WHERE e.numobjectif = o.numobjectif AND e.numaction = a.numaction AND o.numobjectif = :id")
    public List<EstAssocie> getActionForOneObjectif(@Param("id") int id);

    @Query("FROM Objectif WHERE NUMOBJECTIF= :numobjectif OR LIBOBJECTIF= :libobjectif")
    public List<Objectif> searchObjectif(@Param("numobjectif") int nummission, @Param("libobjectif") String libobjectif);

    @Query("FROM Objectif WHERE LIBOBJECTIF LIKE :libobjectif")
    public List<Objectif> searchObjectif( @Param("libobjectif") String libobjectif);
}
