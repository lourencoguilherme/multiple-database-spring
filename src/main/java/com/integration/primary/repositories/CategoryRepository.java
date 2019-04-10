package com.integration.primary.repositories;

import com.integration.config.core.repository.GenericRepository;
import com.integration.primary.models.Category;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface CategoryRepository extends GenericRepository<Category> {
}
