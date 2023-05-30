package clase2_Exceptions;

public class Conexion {
    // 2da parte, crear el metodo que THROWS/THROW la excepcion del 1er paso
    public void conectar(String nombreServer) throws  ServerTimeOutException{
        boolean exito =abrir(nombreServer, 80);
        // ! negacion ... NO ES TRUE
        if(!exito){
            throw new ServerTimeOutException("no me puedo conectar", 80);
        }

    }

    public boolean abrir(String nombre, int puerto){
        // hacer ..... la logica en cuestion
        return false;
    }
}
