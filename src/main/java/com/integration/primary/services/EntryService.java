package com.integration.primary.services;

import com.integration.primary.models.Entry;
import com.integration.primary.repositories.EntryRepository;
import com.integration.secondary.services.SecondaryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
  @Autowired
  private EntryRepository repository;

  @Autowired
  private SecondaryEntryService secondaryEntryService;

  public List<Entry> findAll() {
    List<Entry> obj = repository.findAll();
    /*List<EntryDTO> objDTO = obj.stream().map(x -> new EntryDTO(x)).collect(Collectors.toList());*/
    return obj;
  }

  public Optional<Entry> findById(Long id) {
    return  repository.findById(id);
  }

  public Entry create(Entry obj) {
    obj.setId(null);
    obj = repository.save(obj);

    com.integration.secondary.models.Category category = new com.integration.secondary.models.Category();
    category.setId(obj.getCategory().getId());
    com.integration.secondary.models.Entry entry = new com.integration.secondary.models.Entry(obj.getType(), obj.getAmount(), obj.getDate(), obj.getPaid(), category);
    entry.setId(obj.getId());
    entry.setName(obj.getName());
    entry.setDescription(obj.getDescription());
    secondaryEntryService.create(entry);
    return obj;
  }

  public Entry update(Entry obj) {

    obj = repository.save(obj);

    com.integration.secondary.models.Category category = new com.integration.secondary.models.Category();
    category.setId(obj.getCategory().getId());

    com.integration.secondary.models.Entry entry = new com.integration.secondary.models.Entry(obj.getType(), obj.getAmount(), obj.getDate(), obj.getPaid(), category);
    entry.setId(obj.getId());
    entry.setName(obj.getName());
    entry.setDescription(obj.getDescription());
    secondaryEntryService.update(entry);
    return obj;

  }

  public void delete(Long id) {

    repository.deleteById(id);
    secondaryEntryService.delete(id);
  }

  public Entry findByName(String name) {
    return null;
  }

}
