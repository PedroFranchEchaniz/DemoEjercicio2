package com.example.demo.ejercicio2.clases;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class VideoPk implements Serializable {

    private CursoOnline curso;

    private Long codVideo;

    private VideoPk(){};
}
