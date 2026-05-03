package com.jaabir.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.mapper.ProjectMapper;
import com.jaabir.backend.model.Project;
import com.jaabir.backend.repository.ProjectRepository;

@Service
public class ProjectService {
  private final ProjectRepository projectRepository;
  private final ProjectMapper projectMapper;

  public ProjectService(ProjectRepository projectRepository,
      ProjectMapper projectMapper) {
    this.projectRepository = projectRepository;
    this.projectMapper = projectMapper;
  }

  @Transactional
  public ProjectDTO createProject(ProjectDTO dto) {
    Project project = projectMapper.toProject(dto);
    projectRepository.save(project);
    return projectMapper.toDto(project);
  }

  @Transactional(readOnly = true)
  public List<ProjectDTO> getAllProjects() {
    List<Project> projects = projectRepository.findAll(); 
    return projects.stream()
      .map(projectMapper::toDto).
      toList();
  }
}
