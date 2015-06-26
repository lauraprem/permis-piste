package com.epul.service;

import com.epul.model.EstAssocie;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IEstAssocieService {
    boolean addEstAssocie(EstAssocie association);

    boolean suppressEstAssocie(EstAssocie association);
    
    EstAssocie findEstAssocie(int id);
}
