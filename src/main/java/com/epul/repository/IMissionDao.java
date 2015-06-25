package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Fixe;
import com.epul.model.Mission;

public interface IMissionDao extends JpaRepository<Mission, Integer> {
    @Query("FROM Fixe AS f, Mission as m, Objectif AS o WHERE o.numobjectif = f.numobjectif AND m.nummission = f.nummission AND m.nummission = :idmission")
    public List<Fixe> missionObjectif(@Param("idmission") int idmission);

}
