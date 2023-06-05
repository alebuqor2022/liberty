package model;

import javax.persistence.*;

@Entity
@Table(name="ciudades")
public class Ciudad {
    private static final long serialVersionUID=-1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nombre;
                                        // eager: carga temprana, carga rapida
    @ManyToOne(fetch = FetchType.LAZY) // lazy: carga demorada, carga haragana, carga lenta
    @JoinColumn(name="fk_pais")
    private Pais pais;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }



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


}
