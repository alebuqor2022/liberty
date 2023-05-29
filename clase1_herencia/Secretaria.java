package clase1_herencia;

public class Secretaria extends  Empleado{
    String nombreGerencia;
    String colorUniforme; // variable
    final String COLOR_UNIFORME="azul"; // constante, no puedo tener un SETTER de una constante

    // overriding
    public Secretaria(String nombre){
        super(nombre);
    }

    @Override
    public void imprimir(String valor) {
        System.out.println("estoy imprimiendo a la Secretaria");
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("la Secretaria tiene uniforme " + COLOR_UNIFORME);
    }

    public String getNombreGerencia() {
        return nombreGerencia;
    }

    public void setNombreGerencia(String nombreGerencia) {
        this.nombreGerencia = nombreGerencia;
    }


}
