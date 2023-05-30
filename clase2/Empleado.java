package clase2;

public class Empleado {
    private String titulo;
    private String nombre;
    private int salario;

    public Empleado(String nombre, String titulo, int salario) {
        super(); // --> va a Object
        this.titulo = titulo;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getDetails() {
        return "Nombre: " + this.nombre + " salario: " + this.salario;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
