package com.epul.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Fixe;
import com.epul.model.Mission;

public interface IMissionDao extends JpaRepository<Mission, Integer> {
    @Query("FROM Fixe AS f, Mission as m, Objectif AS o WHERE o.numobjectif = f.numobjectif AND m.nummission = f.nummission AND m.nummission = :idmission")
    public List<Fixe> missionObjectif(@Param("idmission") int idmission);

    @Query("FROM Mission WHERE NUMMISSION= :nummission OR NUMJEU= :numjeu OR LIBMISSION= :libmission")
    public List<Mission> searchMission(@Param("nummission") int nummission, @Param("numjeu") int numjeu, @Param("libmission") String libmission);

    @Query("FROM Mission WHERE LIBMISSION LIKE :libmission")
    public List<Mission> searchMission( @Param("libmission") String libmission);

    @Transactional
    @Modifying
    @Query("UPDATE Mission set  LIBMISSION = :libmission where NUMMISSION = :id")
    public void modifyMission(@Param("libmission") String libmission , @Param("id") int id);

    @Query("FROM Mission WHERE NUMJEU LIKE :numjeu")
    public List<Mission> getMissionFromJeu( @Param("numjeu") int numjeu);
}
