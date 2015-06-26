package com.epul.repository;

import com.epul.model.Calendrier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IDateDao  extends JpaRepository<Calendrier, Date> {
}
