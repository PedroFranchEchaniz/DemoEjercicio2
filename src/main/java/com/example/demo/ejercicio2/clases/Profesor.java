package com.example.demo.ejercicio2.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Profesor {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private String email;

    private double puntuacion;

    @ToString.Exclude
    @OneToMany(mappedBy = "profesor", orphanRemoval = true)
    private List<CursoOnline> cursoOnlines = new ArrayList<>();

}
