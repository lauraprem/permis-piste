package com.epul.repository;

import com.epul.model.Regle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IRegleDao extends JpaRepository<Regle,Integer> {
    @Query("FROM Indicateur WHERE NUMINDIC= :numaction")
    public List<Regle> getRegleForAction(@Param("numaction") int numAction);

}
