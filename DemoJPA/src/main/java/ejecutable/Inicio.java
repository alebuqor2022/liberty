package ejecutable;

import dao.DaoCiudad;
import dao.DaoPais;
import dao.DaoPersona;
import dao.DaoEstudiante;
import dao.DaoCurso;
import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
       //crearPersona();
       // buscar();
       // modificar();
      //  borrar();
      //  crearPais();
      //  crearCiudad();
        System.out.println("trabajando ...");
       // crearCurso();
        verEstudianteCurso();
    }

    static void verEstudianteCurso(){
        List<Curso> cursos= DaoCurso.findAllCursos(1);
        for (Object o : cursos){
            System.out.println(resultAsString(o));
        }
    }

    private static String resultAsString(Object o) {
        if (o instanceof Object[]) {
            return Arrays.asList((Object[])o).toString();
        } else {
            return String.valueOf(o);
        }
    }
    static void crearCurso(){

        Estudiante e= new Estudiante();
        e.setNombre("Oscar");
        e.setApellido("Grande");
        Estudiante e1= new Estudiante();
        e1.setNombre("Ale");
        e1.setApellido("Buq");

        List<Estudiante> est=new ArrayList<Estudiante>();
        est.add(e);
        est.add(e1);

        Curso c=new Curso();
        c.setNombre("Java");
        c.setEstudiantes(est);

        DaoEstudiante.create(e);
        DaoEstudiante.create(e1);
        DaoCurso.create(c);



    }

    static void crearPais(){
        Pais p=new Pais();
        p.setNombre("España");
        DaoPais.create(p);

        Pais p1=new Pais();
        p1.setNombre("Argentina");
        DaoPais.create(p1);
    }

    static void crearCiudad(){
        Ciudad c=new Ciudad();
        c.setNombre("Madrid");
        c.setPais(DaoPais.find(1L));
        DaoCiudad.create(c);

        Ciudad c1=new Ciudad();
        c1.setNombre("Toledo");
        c1.setPais(DaoPais.find(1L));
        DaoCiudad.create(c1);

        Ciudad c2=new Ciudad();
        c2.setNombre("BuenosAires");
        c2.setPais(DaoPais.find(2L));
        DaoCiudad.create(c2);

        Ciudad c3=new Ciudad();
        c3.setNombre("SantaFe");
        c3.setPais(DaoPais.find(2L));
        DaoCiudad.create(c3);
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
