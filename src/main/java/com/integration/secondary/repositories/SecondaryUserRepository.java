package com.integration.secondary.repositories;

import com.integration.config.core.repository.GenericRepository;
import com.integration.secondary.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryUserRepository extends GenericRepository<User> {
}
