package com.integration.secondary.services;

import com.integration.secondary.dto.CategoryDTO;
import com.integration.secondary.models.Category;
import com.integration.secondary.repositories.SecondaryCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecondaryCategoryService {
  @Autowired
  private SecondaryCategoryRepository repository;

  public List<?> findAll() {
    List<?> list = repository.findAll();
    return list;
  }

  public Optional<CategoryDTO> findById(Long id) {

    return Optional.of(new CategoryDTO(repository.findById(id).orElse(null)));
  }

  public Category create(Category obj) {
    obj.setId(null);
    return repository.save(obj);
  }

  public Category update(Category obj) {
    return repository.save(obj);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }

  public Category findByName(String name) {
    return null;
  }

}
