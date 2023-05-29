package clase1_herencia;

public abstract class Figura {
    // POJO --> PLAIN OLD JAVA OBJECT
    // VO --> VALUE OBJECT
    // DTO --> DATA TRANSFER OBJECT
    // BEAN OJECT
    private String nombre;
    private String color;
     String tamaño; // o visibilidad public o package

    // para recuperar el dato de nombre
    public String getNombre() { // una funcion, CON RETORNO
        return nombre;
    }
    // paara inicializar o modificar el dato de nombre
    public void setNombre(String nombre) { // una rutina, subrutina, procedure, SIN RETORNO
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


protected abstract void mover(int x, int y);
protected abstract double calcular();

}
