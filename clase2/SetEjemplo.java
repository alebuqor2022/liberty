package clase2;

import java.util.HashSet;
import java.util.Set;

public class SetEjemplo {
    public static void main(String[] args){
        // lista SIN DUPLICADOS
        // DESORDENADA, no respeta el orden de la carga de sus elementos

        Set lista = new HashSet();

        lista.add("uno");
        lista.add("dos");
        lista.add("3ero");
        lista.add(4);
        lista.add("segundo");
        lista.add(2.5);
        lista.add(true);
        lista.add("uno");
        lista.add(4);

        System.out.println(lista);

    }
}
