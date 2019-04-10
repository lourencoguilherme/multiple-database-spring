package com.integration.secondary.dto;

import com.integration.secondary.models.Entry;

public class EntryDTO extends CommonDTO {

  public EntryDTO() {

  }
  public EntryDTO(Entry obj) {
    super(obj.getId(), obj.getDescription(), obj.getName(), obj.getDeleted());
  }

}
