package com.jaabir.backend.repository;

import com.jaabir.backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is the repository for Project objects.
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
  
}
