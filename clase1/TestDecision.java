package clase1;

import java.lang.*; // es una libreria que no hace falta importarla, siempre esta montado en memoria

public class TestDecision {
    public static String nombre;

    public static void main(String args[]){
        // con todo static
    System.out.println("hola mundo");
    nombre=saludar();
    System.out.println(nombre);
       // a traves de la instaciacion de objetos
    TestDecision test=new TestDecision();
    System.out.println(test.saludar2()+ " 2do caso con instancia");

    // llamo a otros metodos de otras clases
        Variables v= new Variables(); // llamado al metodo constructor vacio
        v.saludoVariables();

        Iteradores i= new Iteradores();
        i.saludoIteradores();


  }

private static String saludar(){
    return "Alejandra";
}
private String saludar2(){
    return "Alejandra";
}

} // fin de la clase TestDecision



class Variables{
void saludoVariables(){
    System.out.println("hola variables");
}
}

class Iteradores{
void saludoIteradores(){
    System.out.println("hola iteradores");
}
}
// visibilidad
// public, private, package, protected