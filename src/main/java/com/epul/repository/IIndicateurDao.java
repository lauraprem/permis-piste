package com.epul.repository;

import com.epul.model.Indicateur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IIndicateurDao extends JpaRepository<Indicateur, Integer> {
}
