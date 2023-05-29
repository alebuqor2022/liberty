package clase1;

public class Cuadrado {
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

}
