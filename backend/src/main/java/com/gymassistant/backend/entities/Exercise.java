package com.gymassistant.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="exercise")
public class Exercise {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description", length = 500)
    private String description;

    @Column(name="sets_number")
    private int setsNumber;

    @Column(name="reps_number")
    private int repsNumber;

    @ManyToOne @JoinColumn(name="user.id")
    private User user;
}
