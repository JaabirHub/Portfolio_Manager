package com.jaabir.backend.mapper;

import org.springframework.stereotype.Component;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.model.Project;

@Component
public class ProjectMapper {
  
  public ProjectDTO toDto(Project project) {
    ProjectDTO dto = new ProjectDTO();
    dto.setId(project.getId());
    dto.setName(project.getName());
    dto.setDesc(project.getDesc());
    dto.setGitUrl(project.getGitUrl());
    dto.setLiveUrl(project.getLiveUrl());
    dto.setStatus(project.getStatus());
    dto.setBackend(project.getBackend());
    dto.setFrontend(project.getFrontend());
    dto.setTools(project.getTools());
    return dto;
  }

  public Project toProject(ProjectDTO dto) {
    Project project = new Project();
    project.setId(dto.getId());
    project.setName(dto.getName());
    project.setDesc(dto.getDesc());
    project.setGitUrl(dto.getGitUrl());
    project.setLiveUrl(dto.getLiveUrl());
    project.setStatus(dto.getStatus());
    project.setBackend(dto.getBackend());
    project.setFrontend(dto.getFrontend());
    project.setTools(dto.getTools());
    return project;
  }
}
