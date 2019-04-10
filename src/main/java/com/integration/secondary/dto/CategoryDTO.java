package com.integration.secondary.dto;
import com.integration.secondary.models.Category;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDTO extends CommonDTO {

  private List<EntryDTO> entries;

  public CategoryDTO(Category obj) {
    super(obj.getId(), obj.getDescription(), obj.getName(), obj.getDeleted());
    this.entries = obj.getEntries().stream().map(x -> new EntryDTO(x)).collect(Collectors.toList());
  }

  public List<EntryDTO> getEntries() {
    return entries;
  }

  public void setEntries(List<EntryDTO> entries) {
    this.entries = entries;
  }

}
