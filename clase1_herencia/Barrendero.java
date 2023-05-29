package clase1_herencia;

public final class Barrendero extends  Empleado {
// final en una class, indica que NO PUEDE TENER HIJOS, no puede ser subclaseada

    @Override
    public void imprimir(String valor) {
        System.out.println("estoy en el Barrendero");
    }
}
