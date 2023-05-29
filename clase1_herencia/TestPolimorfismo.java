package clase1_herencia;

public class TestPolimorfismo {

    public static void main(String[] args){
       // Figura f= new Figura() ; // no puedo instanciar, xq Figura es ABSTRACT
        Figura f = new Circulo();
        f.mover(6,7);
        f.calcular();

        Figura f1= new Cuadrado();
        f1.setNombre("verde");
        f1.mover(5,7);
        f1.calcular();

        verPolimorfismo(f);
        verPolimorfismo(f1);

    }

    public static  void verPolimorfismo(Figura f){
        if (f instanceof  Cuadrado){
            System.out.println(f.getNombre());
            ((Cuadrado) f).pintarCuadrado(); // aplico CASTING a Figura con Cuadrado
        } else {
            ((Circulo ) f).convertirMandala();
        }
    }
}
