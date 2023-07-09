package com.gymassistant.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {
    private String username;
    private LocalDate birthdate;
    private int weight;
}
