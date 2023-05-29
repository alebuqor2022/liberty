package clase1;

public class EjemploSwitch {
    public void demo(int dato){
        //int mes=4;
        switch(dato){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tiene 30 dias");
                break;
            case 2:
                System.out.println("tiene 28/29 dias");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
