package com.jaabir.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaabir.backend.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
  
}
