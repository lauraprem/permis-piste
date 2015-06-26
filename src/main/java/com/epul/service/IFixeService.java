package com.epul.service;

import java.util.List;

import com.epul.model.Fixe;

public interface IFixeService {
List<Fixe> getAllFixe();

List<Fixe> getFixeFromMission(int idMission);

List<Fixe> getFixeFromObjectif(int idObjectif);

void addFixe(Fixe fixe);
} 
