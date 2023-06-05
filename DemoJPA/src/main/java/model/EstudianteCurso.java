package model;

import javax.persistence.*;

@Entity
@Table(name="estudiante_cursos")
public class EstudianteCurso {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name="fk_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name="fk_curso")
    private Curso curso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}
