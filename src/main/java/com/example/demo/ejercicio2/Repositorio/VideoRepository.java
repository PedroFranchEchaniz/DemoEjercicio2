package com.example.demo.ejercicio2.Repositorio;

import com.example.demo.ejercicio2.clases.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}