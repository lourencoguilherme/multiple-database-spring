package com.integration.primary.services;

import com.integration.primary.dto.CategoryDTO;
import com.integration.primary.models.Category;
import com.integration.primary.repositories.CategoryRepository;
import com.integration.secondary.services.SecondaryCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository repository;

  @Autowired
  private SecondaryCategoryService secondaryCategoryService;

  public List<CategoryDTO> findAll() {
    List<Category> list = repository.findAll();
    return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
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
    secondaryCategoryService.delete(id);
    repository.deleteById(id);
  }

  public Category findByName(String name) {
    return null;
  }

}
