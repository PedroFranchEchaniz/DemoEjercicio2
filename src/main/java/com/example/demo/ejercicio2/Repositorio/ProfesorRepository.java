package com.example.demo.ejercicio2.Repositorio;

import com.example.demo.ejercicio2.clases.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}