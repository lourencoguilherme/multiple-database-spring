package com.integration.config.core.repository;

import com.integration.common.domain.Common;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository <T extends Common> extends
  CrudRepository<T, Long>, JpaSpecificationExecutor<T>, JpaRepository<T, Long> {
}
