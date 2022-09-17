package com.fyrd.demospringboots3.repository;

import com.fyrd.demospringboots3.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
