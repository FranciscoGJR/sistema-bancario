package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {

}
