package com.jaabir.backend.service;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.mapper.ProjectMapper;
import com.jaabir.backend.model.Project;
import com.jaabir.backend.repository.ProjectRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This holds the business logic for project objects.
 */
@Service
public class ProjectService {
  private final ProjectRepository projectRepository;
  private final ProjectMapper projectMapper;

  /**
   * This injects the necessary classes.
   *
   * @param projectRepository This is the repository for project objects.
   * @param projectMapper This is the mapper class for project objects.
   */
  public ProjectService(ProjectRepository projectRepository,
      ProjectMapper projectMapper) {
    this.projectRepository = projectRepository;
    this.projectMapper = projectMapper;
  }

  /**
   * This creates a new project.
   *
   * @param dto The incoming details of the project.
   * @return The created project.
   */
  @Transactional
  public ProjectDTO createProject(ProjectDTO dto) {
    Project project = projectMapper.toProject(dto);
    projectRepository.save(project);
    return projectMapper.toDto(project);
  }

  /**
   * This gets all projects.
   *
   * @return The list of projects.
   */
  @Transactional(readOnly = true)
  public List<ProjectDTO> getAllProjects() {
    List<Project> projects = projectRepository.findAll(); 
    return projects.stream()
      .map(projectMapper::toDto)
      .toList();
  }
}
