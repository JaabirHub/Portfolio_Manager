package com.jaabir.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.service.ProjectService;

@RestController
@RequestMapping("/dashboard")
public class ProjectController {
  private final ProjectService projectService;
  
  public ProjectController(ProjectService projectService) {
    this.projectService = projectService;
  }
  
  
  @PostMapping("/project")
  public ResponseEntity<ProjectDTO> createProject(ProjectDTO dto) {
    ProjectDTO project = projectService.createProject(dto);
    return ResponseEntity.ok(project);
  }

  @GetMapping("/project")
  public ResponseEntity<List<ProjectDTO>> getAllProjects() {
    List<ProjectDTO> projects = projectService.getAllProjects();
    return ResponseEntity.ok(projects);
  }
}
