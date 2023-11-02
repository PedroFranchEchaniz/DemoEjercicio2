package com.example.demo.ejercicio2.clases;

import jakarta.persistence.*;
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
public class CursoOnline {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;


    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    public void addToProfesor( Profesor p){
        this.profesor = p;
        p.getCursoOnlines().add(this);
    }

    public void removeFromProfesor(Profesor p){
        this.profesor = null;
        p.getCursoOnlines().remove(this);
    }

    @OneToMany(
            mappedBy = "cursoOnline",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Video> videos = new ArrayList<>();



}
