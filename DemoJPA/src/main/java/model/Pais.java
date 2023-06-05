package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="paises")
public class Pais {
    private static final long serialVersionUID=-1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nombre;

    @OneToMany(mappedBy = "pais", targetEntity = Ciudad.class, cascade = CascadeType.ALL)
    private Set<Ciudad> ciudades;

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
    public Set<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Set<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }


}
