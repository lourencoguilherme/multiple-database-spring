package com.integration.secondary.repositories;

import com.integration.config.core.repository.GenericRepository;
import com.integration.secondary.models.Category;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface SecondaryCategoryRepository extends GenericRepository<Category> {
}
