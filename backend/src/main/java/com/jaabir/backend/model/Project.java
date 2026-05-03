package com.jaabir.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

/**
 * This class is a Project object.
 */
@Entity
@Table(name = "Project")
public class Project {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "desc")
  private String desc;

  @Column(name = "gitUrl")
  private String gitUrl;

  @Column(name = "liveUrl")
  private String liveUrl;

  @Enumerated(EnumType.STRING)
  @Column(name = "status")
  private Status status;

  @Column(name = "backend")
  private List<String> backend;

  @Column(name = "frontend")
  private List<String> frontend;

  @Column(name = "tools")
  private List<String> tools;

  /**
   * Constructor for JPA.
   */
  public Project() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getGitUrl() {
    return gitUrl;
  }

  public void setGitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
  }

  public String getLiveUrl() {
    return liveUrl;
  }

  public void setLiveUrl(String liveUrl) {
    this.liveUrl = liveUrl;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public List<String> getBackend() {
    return backend;
  }

  public void setBackend(List<String> backend) {
    this.backend = backend;
  }

  public List<String> getFrontend() {
    return frontend;
  }

  public void setFrontend(List<String> frontend) {
    this.frontend = frontend;
  }

  public List<String> getTools() {
    return tools;
  }

  public void setTools(List<String> tools) {
    this.tools = tools;
  }
}
