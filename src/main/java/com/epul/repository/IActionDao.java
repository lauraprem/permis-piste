package com.epul.repository;

import com.epul.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Pierre on 13/06/2015.
 */
public interface IActionDao extends JpaRepository<Action,Integer> {
}
