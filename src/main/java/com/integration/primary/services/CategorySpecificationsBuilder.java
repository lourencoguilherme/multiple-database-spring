package com.integration.primary.services;

import com.integration.primary.models.Category;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategorySpecificationsBuilder {
  private final List<SearchCriteria> params;

  public CategorySpecificationsBuilder() {
    params = new ArrayList<SearchCriteria>();
  }

  public CategorySpecificationsBuilder with(String key, String operation, String value) {
    params.add(new SearchCriteria(key, operation, value));
    return this;
  }

  public Specification<Category> build() {
    if (params.size() == 0) {
      return null;
    }

    List<Specification> specs = params.stream()
      .map(CategorySpecification::new)
      .collect(Collectors.toList());

    Specification result = specs.get(0);

    for (int i = 1; i < params.size(); i++) {
      result = params.get(i)
        .isOrPredicate()
        ? Specification.where(result)
        .or(specs.get(i))
        : Specification.where(result)
        .or(specs.get(i));
    }
    return result;
  }
}
