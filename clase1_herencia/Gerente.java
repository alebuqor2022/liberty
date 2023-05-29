package clase1_herencia;

public class Gerente extends Empleado implements  Ipagable{
    private String automovil;

    // no puedo hacer OVERRIDING de un metodo marcado en la super con FINAL
//    public final void calcular(){
//
//    }

        public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }


    @Override
    public void imprimir(String valor) {
        System.out.println("estoy imprimiendo al Gerente");
    }

    @Override
    public void pagar(double cantidad) {
        System.out.println("estoy pagando el sueldo al Gerente de " + cantidad);
    }
}
