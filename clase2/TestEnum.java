package clase2;

public class TestEnum {
    public static void main(String[] args){
        Nivel a= Nivel.ALTO;

        switch (a){
            case BAJO:
                System.out.println("es bajo");break;
            case MEDIO:
                System.out.println("es medio");break;
            case ALTO:
                System.out.println("es alto");break;
            default:
                System.out.println("es null");
        }
    }
}
