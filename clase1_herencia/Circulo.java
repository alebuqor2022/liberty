package clase1_herencia;

public class Circulo extends Figura {

    public static double encontrarArea(double radio){
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro(int valor){
        return Math.PI * valor;
    }

    @Override
    protected void mover(int x, int y) {
        System.out.println("muevo el circulo");
    }

    @Override
    protected double calcular() {
        System.out.println("estoy calculando");
        return 0;
    }
    protected void convertirMandala(){
        System.out.println("estoy haciendo un mandala");
    }
}
