package com.curso.service;

import com.curso.model.Curso;
import com.curso.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CursoServiceImp implements CursoService{

    @Autowired
    private CursoRepository cursoRepository;

    // relacion de rombo blanco, donde me pasan mi parte ya creada
    // dependency injection
//    public CursoServiceImp(CursoRepository cursoRepository){
//        this.cursoRepository=cursoRepository;
//    }

    @Override
    public List<Curso> getAllCursos() {
        return this.cursoRepository.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        this.cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(long id) {
        this.cursoRepository.deleteById(id);
    }

    @Override
    public Curso getCursoById(long id) {
        Optional<Curso> opCurso=this.cursoRepository.findById(id);
        Curso curso=null;
        if(opCurso.isPresent()){
            curso=opCurso.get();
        }else{
            throw new RuntimeException("el curso no se encuentra nro " + id);
        }

        return curso;
    }
}
