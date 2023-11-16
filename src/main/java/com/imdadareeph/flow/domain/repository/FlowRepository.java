package com.imdadareeph.flow.domain.repository;

import com.imdadareeph.flow.domain.entities.Flow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowRepository extends CrudRepository<Flow, Long> {
}
