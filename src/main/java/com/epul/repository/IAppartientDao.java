package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Appartient;

public interface IAppartientDao  extends JpaRepository<Appartient, Integer>{
    @Query("FROM Appartient WHERE NUMACTION= :numaction ")
    public List<Appartient> getAppartientFromAction(@Param("numaction") int numaction);
    
    @Query("FROM Appartient WHERE NUMJEU= :numjeu ")
    public List<Appartient> getAppartientFromJeu(@Param("numjeu") int numjeu);
}
