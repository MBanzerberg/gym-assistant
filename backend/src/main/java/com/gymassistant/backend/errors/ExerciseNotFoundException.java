package com.gymassistant.backend.errors;

public class ExerciseNotFoundException extends RuntimeException {
    public ExerciseNotFoundException(int id) {
        super("Could not find Exercise " + id);
    }
}
