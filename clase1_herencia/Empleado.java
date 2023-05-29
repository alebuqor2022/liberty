package clase1_herencia;

import java.util.Date;

public abstract class Empleado { // no permite crear instancias de Empleado, la marca de ABSTRACT
   private String nombre;
   public int edad;
   protected int legajo;
   Date fechaIngreso; // visibilidad default es PACKAGE

    public Empleado(){}

    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public void mostrarInfo(){
        System.out.println("el empleado se llama " + this.getNombre() + " con el legajo nro " + this.getLegajo());
        System.out.println("el empleado tiene " + this.getEdad() + " años");

    }
    public abstract void imprimir(String valor); // va a implementarse obligatoriamente en las clases hijas

    // un metodo marcado con FINAL --> no permite realizar OVERRIDING en las hijas/suclasses
    public final void calcular(){
        System.out.println("estoy calculando la edad del empleado " + getEdad()) ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
