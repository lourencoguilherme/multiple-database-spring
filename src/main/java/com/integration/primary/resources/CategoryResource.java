package com.integration.primary.resources;

import com.integration.primary.dto.CategoryDTO;
import com.integration.primary.models.Category;
import com.integration.primary.repositories.CategoryRepository;
import com.integration.primary.services.CategoryService;
import com.integration.primary.services.CategorySpecification;
import com.integration.primary.services.SearchCriteria;
import com.integration.secondary.services.SecondaryCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/categories")
public class CategoryResource {
  @Autowired
  private CategoryService service;

  @Autowired
  private SecondaryCategoryService secondaryService;

  @Autowired
  private CategoryRepository repository;

  @GetMapping
  public ResponseEntity<List<?>> findAll() {
    return ResponseEntity.ok().body(secondaryService.findAll());
  }

  @GetMapping(value = "/search")
  public ResponseEntity<List<Category>> findAll(@RequestParam(value = "search") String search) {
    CategorySpecification spec =
      new CategorySpecification(new SearchCriteria("name", "ilike", search));

    List<Category> results = repository.findAll(spec);
    System.out.println(results);
    return ResponseEntity.ok().body(results);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Optional<CategoryDTO>> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(service.findById(id));
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }


  @PostMapping
  public ResponseEntity<Category> create(@Valid @RequestBody Category obj) {
    com.integration.secondary.models.Category category = new com.integration.secondary.models.Category();
    category.setDescription(obj.getDescription());
    category.setName(obj.getDescription());
    category.setDeleted(obj.getDeleted());
    secondaryService.create(category);
    return ResponseEntity.ok().body(service.create(obj));
  }

  @PutMapping
  public ResponseEntity<Category> update(@Valid @RequestBody Category obj) {
    com.integration.secondary.models.Category category = new com.integration.secondary.models.Category();
    category.setId(obj.getId());
    category.setDescription(obj.getDescription());
    category.setName(obj.getDescription());
    category.setDeleted(obj.getDeleted());
    secondaryService.update(category);
    return ResponseEntity.ok().body(service.update(obj));
  }

  /*@GetMapping(value = "/search")
  public List<Category> search(@RequestParam(value = "search") String search) {
    CategorySpecificationsBuilder builder = new CategorySpecificationsBuilder();
    Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
    Matcher matcher = pattern.matcher(search + ",");
    while (matcher.find()) {
      builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
    }

    Specification<Category> spec = builder.build();
    return repository.findAll(spec);
  }*/

}
