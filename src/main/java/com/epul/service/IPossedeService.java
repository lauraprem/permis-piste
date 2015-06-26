package com.epul.service;

import com.epul.model.Possede;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IPossedeService {
    boolean suppressPossede(Possede possede);
    boolean addPossede(Possede possede);
}
