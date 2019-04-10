package com.integration.secondary.services;

import com.integration.secondary.models.Entry;
import com.integration.secondary.repositories.SecondaryEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecondaryEntryService {
  @Autowired
  private SecondaryEntryRepository repository;

  public List<Entry> findAll() {
    List<Entry> obj = repository.findAll();
    return obj;
  }

  public Optional<Entry> findById(Long id) {
    return  repository.findById(id);
  }

  public Entry create(Entry obj) {
    return repository.save(obj);
  }

  public Entry update(Entry obj) {
    return repository.save(obj);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }

  public Entry findByName(String name) {
    return null;
  }

}
