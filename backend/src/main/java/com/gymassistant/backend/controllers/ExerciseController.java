package com.gymassistant.backend.controllers;


import com.gymassistant.backend.entities.Exercise;
import com.gymassistant.backend.entities.ExerciseInformation;
import com.gymassistant.backend.errors.UserNotFoundException;
import com.gymassistant.backend.repositories.ExerciseRepository;
import com.gymassistant.backend.repositories.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Exercise")
@RestController
public class ExerciseController {
    private final ExerciseRepository exerciseRepository;
    private final UserRepository userRepository;

    ExerciseController(ExerciseRepository exerciseRepository, UserRepository userRepository) {
        this.exerciseRepository = exerciseRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("users/{id}/exercises")
    public List<Exercise> getAll(@PathVariable int id) {
        return exerciseRepository.findAll();
    }

    @PostMapping("users/{id}/exercises/add")
    public Exercise saveExercise(@RequestBody ExerciseInformation newExercise, @PathVariable int id) {
        Exercise exercise = new Exercise();
        exercise.setName(newExercise.getName());
        exercise.setDescription(newExercise.getDescription());
        exercise.setSetsNumber(newExercise.getSetsNumber());
        exercise.setRepsNumber(newExercise.getRepsNumber());
        exercise.setUser(userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id)));

        return exerciseRepository.save(exercise);
    }
}
