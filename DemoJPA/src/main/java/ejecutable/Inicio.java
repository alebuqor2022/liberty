package ejecutable;

import dao.DaoPersona;
import model.Persona;

public class Inicio {
    public static void main(String[] args) {
       //crearPersona();
       // buscar();
       // modificar();
        borrar();
    }

    static void crearPersona(){
        System.out.println("----------- Persona de BD ---------");
        Persona p= new Persona();
        p.setNombre("Ale");
        p.setApellido("Buquete Medina");

        DaoPersona.create(p);
    }
    static void buscar(){
        System.out.println("----------- Persona de BD ---------");

        Persona p=DaoPersona.find(1L);
        System.out.println(p.getNombre() + ", " + p.getApellido());

    }

    static void modificar(){
        System.out.println("----------- Persona de BD ---------");
        Persona p=DaoPersona.find(1L);
        p.setNombre("Oscarcito");
        DaoPersona.update(p);
    }

    static void borrar(){
        System.out.println("----------- Persona de BD ---------");
        DaoPersona.delete(-47L);
    }
}
