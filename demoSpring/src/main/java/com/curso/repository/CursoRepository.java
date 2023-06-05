package com.curso.repository;

import com.curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

// esta interfaz dialoga con la BD
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
