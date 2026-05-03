package com.jaabir.backend.mapper;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.model.Project;
import org.springframework.stereotype.Component;

/**
 * This class maps between Project objects to ProjectDTO objects.
 */
@Component
public class ProjectMapper {
  
  /**
   * This maps a Project to a ProjectDTO.
   *
   * @param project The project object.
   * @return This returns a projectdto.
   */
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

  /**
   * This maps a projectdto to a project object.
   *
   * @param dto The projectdto.
   * @return This returns a project object.
   */
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
