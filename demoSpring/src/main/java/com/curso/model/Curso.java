package com.curso.model;

import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nombre;
    @Column
    private String instructor;
    @Column
    private String email;

    public Curso(){}
    public Curso(Long id, String nombreCurso, String instructor, String email) {
        this.id = id;
        this.nombre= nombreCurso;
        this.instructor = instructor;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCurso) {
        this.nombre = nombreCurso;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
