package com.curso.controller;
// dialogar con el frontEnd ... con Postman

import com.curso.model.Curso;
import com.curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos") // http://locahost:8080/cursos
public class CursoController {

    @Autowired
    CursoService servicio;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping
    public List<Curso> listar(){
        return servicio.getAllCursos();
    }



}
