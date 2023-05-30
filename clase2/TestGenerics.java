package clase2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        // entre <> va el formato o type del elemento de la coleccion
        // convertir a la coleccion en HOMOGENEA
        List<String> ciudades = new ArrayList<String>();

        ciudades.add("Buenos Aires"); // add (elemento) definido en Collection
        ciudades.add("Tucumán");
        ciudades.add("Rosario");
        ciudades.add(1, "Paraná"); // usando el add(posicion, elemento) definido en List
        ciudades.add("Buenos Aires");
        ciudades.add("Bariloche");
        //  ciudades.add(22); --> no PERMITE una carga con otro formato, da error en edicion

        Iterator<String> it = ciudades.iterator();

        while (it.hasNext()) {
            System.out.println("Ciudad:" + it.next());
        }

    }

}
