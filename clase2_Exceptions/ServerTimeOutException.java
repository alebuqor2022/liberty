package clase2_Exceptions;
// 1er paso, crear la exception personalizada
public class ServerTimeOutException extends  Exception{
    private int puerto;

    public ServerTimeOutException(String message, int puerto) {
        super(message);
        this.puerto = puerto;
    }
    public int getPuerto() {
        return puerto;
    }
}
