package com.integration.primary.repositories;

import com.integration.config.core.repository.GenericRepository;
import com.integration.primary.models.Entry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface EntryRepository extends GenericRepository<Entry> {
}
