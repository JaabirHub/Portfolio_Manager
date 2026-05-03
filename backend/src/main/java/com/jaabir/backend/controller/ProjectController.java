package com.jaabir.backend.controller;

import com.jaabir.backend.dto.ProjectDTO;
import com.jaabir.backend.service.ProjectService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This exposes the dashboard endpoint.
 */
@RestController
@RequestMapping("/dashboard")
public class ProjectController {
  private final ProjectService projectService;
  
  /**
   * This injects the necessary classes.
   *
   * @param projectService this holds the business logic for the projects.
   */
  public ProjectController(ProjectService projectService) {
    this.projectService = projectService;
  }
  
  
  /**
   * This creates a project.
   *
   * @param dto This is the incoming dto holding the projects details.
   * @return A 200 success http code meaning that the project is created.
   */
  @PostMapping("/project")
  public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO dto) {
    ProjectDTO project = projectService.createProject(dto);
    return ResponseEntity.ok(project);
  }

  /**
   * This gets all projects.
   *
   * @return A l200 success http code with the list of all projects.
   */
  @GetMapping("/project")
  public ResponseEntity<List<ProjectDTO>> getAllProjects() {
    List<ProjectDTO> projects = projectService.getAllProjects();
    return ResponseEntity.ok(projects);
  }
}
