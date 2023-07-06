package com.gymassistant.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="weight")
public class Weight {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="weight")
    private int weight;

    @Column(name="date")
    private LocalDateTime date;

    @ManyToOne @JoinColumn(name="exercise.id")
    private Exercise exercise;
}
