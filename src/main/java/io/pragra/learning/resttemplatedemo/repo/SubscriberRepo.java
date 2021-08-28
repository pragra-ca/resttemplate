package io.pragra.learning.resttemplatedemo.repo;

import io.pragra.learning.resttemplatedemo.domain.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber, Integer> {
}
