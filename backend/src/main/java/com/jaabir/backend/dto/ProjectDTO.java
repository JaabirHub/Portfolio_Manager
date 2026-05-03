package com.jaabir.backend.dto;

import java.util.List;
import com.jaabir.backend.model.Status;

/**
 * This DTO is used to not expose a project object.
 */
public class ProjectDTO {
  private Long id;
  private String name;
  private String desc;
  private String gitUrl;
  private String liveUrl;
  private Status status;
  private List<String> backend;
  private List<String> frontend;
  private List<String> tools;

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
