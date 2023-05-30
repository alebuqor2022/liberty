package clase2_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        ejemplo2();
    }

    static void ejemplo1(){
        List<Nota> notas=new ArrayList<Nota>();
        notas.add(new Nota("matematica", 3));
        notas.add(new Nota("literatura", 8));
        notas.add(new Nota("ingles", 5));
        notas.add(new Nota("fisica", 7));
        Nota nota=buscarNotaSobresaliente(notas);
        System.out.println(nota.getAsignatura() + ": " +nota.getValor());
    }

    static Nota buscarNotaSobresaliente(List<Nota> notas){
        Nota nota=null;
        for (Nota unaNota: notas){
            if (unaNota.getValor() >= 9){
                nota=unaNota;
            }
        }
        return nota;
    }

    static void ejemplo2(){
        List<Nota> notas=new ArrayList<Nota>();
        notas.add(new Nota("matematica", 3));
        notas.add(new Nota("literatura", 8));
        notas.add(new Nota("ingles", 5));
        notas.add(new Nota("fisica", 7));
        Optional<Nota> onota=buscarNotaSobresaliente1(notas);
        if(onota.isPresent()) {
            Nota nota= onota.get();
            System.out.println(nota.getAsignatura() + ": " + nota.getValor());
        } else {
            System.out.println("no hay nota sobresaliente");
       }
    }

    static Optional<Nota> buscarNotaSobresaliente1(List<Nota> notas){
        for (Nota unaNota: notas){
            if (unaNota.getValor() >= 9){
                return Optional.of(unaNota);
            }
        }
        return Optional.empty();
    }
}
