package model;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;

    @Column
    private String nombre;

    @Column(name="apellidos")
    private String apellido;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
