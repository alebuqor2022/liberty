package clase1_herencia;

public class Cuadrado  extends Figura{
    int lado; // atributo, propiedad, caracteristica, campo, descripcion
    static int ladoS;

    // metodos constructores
    public Cuadrado(){}
    public Cuadrado(int lado){
        this.lado=lado; // this, aplica a la instancia
    }

    // inicializador estatico
    static{
        ladoS=8;
    }

    public void mostrarLado(){
        System.out.println(lado);
        System.out.println(ladoS);
    }

    public static void mostrarLadoEstatico(){
         System.out.println(ladoS);
    }

    @Override
    protected void mover(int x, int y) {
        System.out.println("muevo el cuadrado");
    }

    @Override
    protected double calcular() {
        System.out.println("estoy calculando");

        return 0;
    }
    void pintarCuadrado(){
        System.out.println("mi cuadrado es rojo");
    }
}
