package com.integration.user.repositories;

import com.integration.user.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFirstRepository extends JpaRepository<User, Integer> {
}
