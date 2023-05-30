package clase2_Exceptions;

public class TestException {

    public static void main(String[] args) {
        Conexion c= new Conexion();
// 3er paso, catchear la exception del metodo creado en el 2do paso
        try {
            c.conectar("Liberty");
        } catch (ServerTimeOutException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + " al puerto " + e.getPuerto());
        }

    }
}
