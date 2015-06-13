package com.epul.repository;

import com.epul.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionDao extends JpaRepository<Action,Integer> {
}
