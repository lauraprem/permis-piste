package com.epul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epul.model.Apprenant;

//@Repository
public interface IApprenantDao extends JpaRepository<Apprenant,Integer> {

}
