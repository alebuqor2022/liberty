package model;

import javax.persistence.*;

@Entity
@Table
public class Compania {
    private static final long serialVersionUID=-1L;

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column
    private String nombre;
}
