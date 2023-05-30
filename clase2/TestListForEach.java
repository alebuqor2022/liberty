package clase2;

import java.util.ArrayList;
import java.util.List;

public class TestListForEach {
    public static void main(String[] args){
    List<Persona> items=new ArrayList<Persona>();
    items.add(new Persona("Ale", "Buq"));
    items.add(new Persona("Oscar", "Grande"));
    items.add(new Persona("Juana", "LaLoca"));

    // For Each
        for(Persona p : items) {
            System.out.println("el nombre de persona es  " + p.getNombre());
        }
    }
}
