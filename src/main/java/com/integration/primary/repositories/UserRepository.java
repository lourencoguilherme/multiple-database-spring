package com.integration.primary.repositories;

import com.integration.config.core.repository.GenericRepository;
import com.integration.primary.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User> {
}
