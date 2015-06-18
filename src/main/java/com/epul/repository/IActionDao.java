package com.epul.repository;

import com.epul.model.Action;
import com.epul.model.Appartient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionDao extends JpaRepository<Action,Integer> {

    @Query("FROM Appartient AS a, Action AS ac, Jeu AS j WHERE a.numaction = ac.numaction AND j.numjeu = a.numjeu")
    public List<Appartient> actionJeu();

}
