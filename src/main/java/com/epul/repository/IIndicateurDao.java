package com.epul.repository;

import com.epul.model.Indicateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IIndicateurDao extends JpaRepository<Indicateur, Integer> {
    @Query("FROM Indicateur WHERE NUMINDIC= :numindic OR NUMACTION= :numaction OR LIBINDIC= :libindic OR POIDS= :poids")
    public List<Indicateur> searchIndicateur(@Param("numindic") int numindic, @Param("numaction") int numaction, @Param("libindic") String libindic, @Param ("poids") int poids);

    @Query("FROM Indicateur WHERE LIBINDIC= :libindic ")
    public List<Indicateur> searchIndicateur( @Param("libindic") String libindic);

    @Query("FROM Indicateur WHERE NUMACTION= :numaction")
    List<Indicateur> getIndicateurForAction(@Param("numaction") int numAction);
}
