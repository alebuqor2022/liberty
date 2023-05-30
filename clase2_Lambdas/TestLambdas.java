package clase2_Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLambdas {
    public static void main(String[] args) {
        ejemplo3();
    }

    static void ejemplo3(){
        // uso clasico
        for(Integer numero : Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
            System.out.println(numero + " ");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");


        // uso lambdas
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
                n -> System.out.println(n + " ")
        );
        System.out.println("++++++++++++++++++++++++++++++++++++");


        // otra forma reducida con lambdas implicita
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
                System.out::println
        );
    }

    static void ejemplo2(){
        StringFunction exclamar=(s)-> s + "!";
        StringFunction preguntar=(s)-> s + "?";

        System.out.println(exclamar.run("hola"));
        System.out.println(preguntar.run("chau"));

    }

    static void ejemplo1(){
        Pais p1= new Pais("España");
        Pais p2= new Pais("Argentina");
        Pais p3= new Pais("Francia");
        Pais p4= new Pais("Chile");

        List<Pais> paises= new ArrayList<Pais>();
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        paises.add(p4);
        // uso el Consumer(T -> void)
        paises.forEach((p) -> {System.out.println(p.nombre);});
        System.out.println("***********");
        // ordeno la lista de los paises conun Comparador
        comparadorLambda(paises);
        paises.forEach((p) -> {System.out.println(p.nombre);});

    }

    static void comparadorLambda(List<Pais> lista){
        // ordenar por alfabeto la coleccion
        // y guarda la lista ordenada en LA MISMA POSICION DE MEMORIA
        Collections.sort(lista, (p1,p2) ->{return p1.nombre.compareTo(p2.nombre);});
    }
}
