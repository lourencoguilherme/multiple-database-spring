package com.integration.secondary.dto;

import java.io.Serializable;

public class CommonDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  protected Long id;

  public String description;

  public String name;

  private Boolean deleted;

  public CommonDTO() {
  }

  public CommonDTO(Long id, String description, String name, Boolean deleted) {
    this.id = id;
    this.description = description;
    this.name = name;
    this.deleted = deleted;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
}
