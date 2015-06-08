package com.epul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epul.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
