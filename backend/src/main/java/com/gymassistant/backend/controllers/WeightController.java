package com.gymassistant.backend.controllers;

import com.gymassistant.backend.entities.Weight;
import com.gymassistant.backend.entities.WeightInformation;
import com.gymassistant.backend.errors.ExerciseNotFoundException;
import com.gymassistant.backend.repositories.ExerciseRepository;
import com.gymassistant.backend.repositories.WeightRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Weight")
public class WeightController {
    private final WeightRepository weightRepository;
    private final ExerciseRepository exerciseRepository;

    WeightController(WeightRepository weightRepository, ExerciseRepository exerciseRepository) {
        this.weightRepository = weightRepository;
        this.exerciseRepository = exerciseRepository;
    }

    @GetMapping("users/{userId}/exercises/{exerciseId}")
    public List<Weight> getAll() {
        return weightRepository.findAll();
    }

    @PostMapping("users/{userId}/exercises/{exerciseId}/weight/add")
    public Weight saveWeight(@RequestBody WeightInformation newWeight, @PathVariable int exerciseId) {
        Weight weight = new Weight();
        weight.setWeight(newWeight.getWeight());
        weight.setDate(newWeight.getDate());
        weight.setExercise(exerciseRepository.findById(exerciseId)
                .orElseThrow(() -> new ExerciseNotFoundException(exerciseId)));

        return weightRepository.save(weight);
    }
}
