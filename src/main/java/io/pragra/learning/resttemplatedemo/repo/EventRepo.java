package io.pragra.learning.resttemplatedemo.repo;

import io.pragra.learning.resttemplatedemo.domain.PEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<PEvent,Integer> {
}
