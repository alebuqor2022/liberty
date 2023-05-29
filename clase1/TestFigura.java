package clase1;

public class TestFigura {
    public static void main(String[] args){
        Figura f=new Figura();
        f.tamaño="XL";
        f.setColor("amarillo");
        f.setNombre("Triangulo");

        System.out.println(f.getColor() + ", " + f.getNombre() + ", " + f.tamaño);


    }
}
