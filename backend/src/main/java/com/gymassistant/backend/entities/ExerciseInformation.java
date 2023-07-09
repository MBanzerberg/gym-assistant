package com.gymassistant.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseInformation {
    private String name;
    private String description;
    private int setsNumber;
    private int repsNumber;
}
