package clase1_herencia;

public class TestHerencia {

    public static void main(String args[]){
       // Empleado e=new Empleado(); // no puedo instanciar una clase marcada con ABSTRACT

        Gerente g = new Gerente();
        g.setNombre("Juan Perez");
        g.mostrarInfo();
        g.imprimir("nada");
        g.pagar(2000);

        Secretaria s= new Secretaria("Ale");
        s.mostrarInfo();
        s.imprimir("algo");

    }
}
