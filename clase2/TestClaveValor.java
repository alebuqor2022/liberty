package clase2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClaveValor {
    public static void main(String[] args) {
        Persona p1=new Persona("Ale", "Buq");
        Persona p2= new Persona("Oscar", "GrandeCampos");

        Map<String, Persona> personas=new HashMap<String, Persona>();

        personas.put(p1.getApellido(),p1);
        personas.put(p2.getApellido(),p2);

        Set<String> claves=personas.keySet();
        Iterator<String> it= claves.iterator();
        while(it.hasNext()){
            String clave= it.next();
            Persona p= personas.get(clave);
            System.out.println("Clave: " + p.getApellido() + " nombre: " + p.getNombre());
        }
    }
}
