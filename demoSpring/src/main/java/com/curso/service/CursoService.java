package com.curso.service;

import com.curso.model.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> getAllCursos();
    void saveCurso(Curso curso);
    void deleteCurso(long id);
    Curso getCursoById(long id);
}
