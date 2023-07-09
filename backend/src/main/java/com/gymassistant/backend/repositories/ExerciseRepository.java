package com.gymassistant.backend.repositories;

import com.gymassistant.backend.entities.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise,Integer> {
}
