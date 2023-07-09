package com.gymassistant.backend.repositories;

import com.gymassistant.backend.entities.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepository extends JpaRepository<Weight, Integer> {
}
