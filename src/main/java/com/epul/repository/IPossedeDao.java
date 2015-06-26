package com.epul.repository;

import com.epul.model.Possede;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IPossedeDao  extends JpaRepository<Possede, Integer> {
}
