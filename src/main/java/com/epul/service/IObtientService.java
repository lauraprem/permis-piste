package com.epul.service;

import com.epul.model.Obtient;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IObtientService {
    boolean suppressObtient(Obtient obtient);
    boolean addObtient(Obtient obtient);
}
