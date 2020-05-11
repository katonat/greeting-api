package io.github.pedron98.repository;

import io.github.pedron98.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
    Greeting findOneByMessage(String message);
}
