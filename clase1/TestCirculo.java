package clase1;

public class TestCirculo {
    public static void main(String args[]){
        // llamada a metodo de objeto (sinonimo objeto= instancia)
        // a traves de la instanciacion con el NEW
        Circulo c1=new Circulo(); // llamamos al metodo constructor vacio, es el default
        double rpta=c1.calcularPerimetro(33);
        System.out.println(rpta);

        // llamada a metodo de clase
        // el metodo esta marcado con STATIC
        double area=Circulo.encontrarArea(7.3);
        System.out.println(area);
    }
}
