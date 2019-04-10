package com.integration.primary.resources;
import com.integration.primary.models.Entry;
import com.integration.primary.services.EntryService;
import com.integration.secondary.services.SecondaryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/entries")
public class EntryResource {
  @Autowired
  private EntryService service;

  @Autowired
  private SecondaryEntryService secondaryService;

  @GetMapping
  public ResponseEntity<List<?>> findAll() {
    return ResponseEntity.ok().body(secondaryService.findAll());
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Optional<Entry>> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(service.findById(id));
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }


  @PostMapping
  public ResponseEntity<Entry> create(@Valid @RequestBody Entry obj) {
    return ResponseEntity.ok().body(service.create(obj));
  }

  @PutMapping
  public ResponseEntity<Entry> update(@Valid @RequestBody Entry obj) {
    return ResponseEntity.ok().body(service.update(obj));
  }

}
