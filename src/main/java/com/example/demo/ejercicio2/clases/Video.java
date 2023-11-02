package com.example.demo.ejercicio2.clases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@IdClass(VideoPk.class)
public class Video {

    @Id @GeneratedValue
    private Long id;

    private int orden;

    private String descripcion;

    private String ult;

    @Id
    @ManyToOne
    private CursoOnline cursoOnline;

    public void addToCurso (CursoOnline c){
        this.cursoOnline = c;
        c.getVideos().add(this);
    }

    public void removeFromCurso (CursoOnline c){
        this.cursoOnline = null;
        c.getVideos().remove(this);
    }
}
