package com.epul.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Action;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionDao extends JpaRepository<Action,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Action set  ACT_NUMACTION = :act_numaction, LIBACTION = :lib, SCOREMIN = :scoremin where NUMACTION = :id")
    public void modifyAction(@Param("act_numaction") int act_numaction , @Param("lib") String lib, @Param("scoremin") int scoremin,@Param("id") int id);

    @Transactional
    @Modifying
    @Query("UPDATE Action set LIBACTION = :lib, SCOREMIN = :scoremin where NUMACTION = :id")
    public void modifyAction(@Param("lib") String lib, @Param("scoremin") int scoremin,@Param("id") int id);
    
    @Query("FROM Action WHERE NUMACTION= :numaction OR ACT_NUMACTION= :act_numaction OR LIBACTION LIKE :libaction OR SCOREMIN= :scoremin")
    public List<Action> searchAction(@Param("numaction") int numaction, @Param("act_numaction") int act_numaction, @Param("libaction") String libaction, @Param ("scoremin") int scoremin);

    @Query("FROM Action WHERE LIBACTION LIKE :libaction ")
    public List<Action> searchAction( @Param("libaction") String libindic);
    
    @Query("FROM Action WHERE ACT_NUMACTION= :act_numAction ")
    public List<Action> getActNumAction( @Param("act_numAction") int act_numAction);
}
