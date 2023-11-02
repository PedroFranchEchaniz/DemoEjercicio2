package com.example.demo.ejercicio2;

import com.example.demo.ejercicio2.Repositorio.CursOnlineRepository;
import com.example.demo.ejercicio2.Repositorio.ProfesorRepository;
import com.example.demo.ejercicio2.Repositorio.VideoRepository;
import com.example.demo.ejercicio2.clases.CursoOnline;
import com.example.demo.ejercicio2.clases.Profesor;
import com.example.demo.ejercicio2.clases.Video;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {
    private final CursOnlineRepository cursOnlineRepository;
    private final VideoRepository videoRepository;
    private final ProfesorRepository profesorRepository;

    @PostConstruct
    public void init(){
        Profesor p1 = Profesor.builder()
                .nombre("Pedro")
                .email("pedrofe.av@gmail.com")
                .puntuacion(2L)
                .build();
        profesorRepository.save(p1);

        Video v1 = Video.builder()
                .descripcion("Un video")
                .ult("http://local")
                .orden(2)
                .build();
        videoRepository.save(v1);

        CursoOnline c1 = CursoOnline.builder()
                .nombre("un curso")
                .puntuacion(2)
                .build();
        cursOnlineRepository.save(c1);

        v1.addToCurso(c1);
        c1.addToProfesor(p1);

        videoRepository.save(v1);
        cursOnlineRepository.save(c1);


    }
}
