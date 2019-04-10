package com.integration.primary.dto;

import com.integration.primary.models.Entry;

public class EntryDTO extends CommonDTO {

  public EntryDTO() {

  }
  public EntryDTO(Entry obj) {
    super(obj.getId(), obj.getDescription(), obj.getName(), obj.getDeleted());
  }

}
