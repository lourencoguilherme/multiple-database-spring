package com.integration.secondary.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.integration.common.domain.Common;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
public class Category extends Common {

  @JsonIgnore @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
  private List<Entry> entries = new ArrayList<>();

  public Category() {
  }

  public List<Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }
}
