package com.bridgelabz.repository;

import com.bridgelabz.model.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingsAppRepository extends JpaRepository<Greetings, Integer> {
}
