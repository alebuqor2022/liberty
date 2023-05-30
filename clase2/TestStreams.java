package clase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args){
        ejemplo3();
    }

    static void ejemplo1(){
        // uso Stream como objeto
        Stream.iterate(0, n -> n + 10 ).limit(15).forEach(StreamEjemplo::imprimir);
        System.out.println("+++++++++++++++++++++++++");
        Stream<Integer> nros=Stream.iterate(0, n -> n + 10 );
        nros.limit(15).forEach(StreamEjemplo::imprimir);
    }

    static void ejemplo2(){
        // uso stream() como metodo de Collection
        List<Integer> li = Arrays.asList(5,6,10,12,25,74);
        int suma= li.stream()
                .mapToInt(x->x.intValue())
                .sum();
        System.out.println("la suma es: " + suma);
        // filtrando
        long pares= li.stream()
                .filter(x->x%2 == 0)
                .count();
        System.out.println("la cantidad de pares es: " + pares);

        // en vez de usar List, cargo los elementos via Stream.of
        Object[] arrInt=Stream.of(5,6,10,12,25,74)
                                .filter(x->x%2 == 0)
                                .toArray();
        for(Object elemento: arrInt){
            System.out.println("los pares son: " + elemento);
        }

    }

    static void ejemplo3(){
        Empleado e1=new Empleado("Ana", "Secretaria", 1600);
        List<Empleado> lista=new ArrayList<>();
        lista.add(new Empleado("Ale", "Directora", 3300));
        lista.add(new Empleado("Juan", "Gerente", 5400));
        lista.add(new Empleado("Francisca", "Jefe", 2700));
        lista.add(e1);

        double promedio= lista.stream()
                        .mapToInt(empleado -> empleado.getSalario())
                        .average()
                        .getAsDouble();

        System.out.println("el promedio de salarios es " + promedio);
    }
}
