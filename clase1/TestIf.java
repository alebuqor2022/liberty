package clase1;

public class TestIf {
    // sobrecarga OVERLOAD
    public TestIf(){}
    public TestIf(String valor){
        System.out.println("estoy en el 2do constructor");
    }
    public TestIf(String valor, int nro){
        System.out.println("estoy en el 3er constructor");
    }
    public TestIf(double valor){
        System.out.println("estoy en el 4to constructor");
    }

    public static void main(String[] args){
        TestIf test = new TestIf();
        TestIf test0 = new TestIf();
        TestIf test1 = new TestIf("Alejandra");
        TestIf test2 = new TestIf(88.77);
        TestIf test3 = new TestIf("Oscar", 99);

        test.ejemplo0(1);
        test0.ejemplo0(2);
        test1.ejemplo0(3);
        test2.ejemplo0(4);
        test3.ejemplo0(5);

        test.ejemplo1();
        test.ejemplo2();

        EjemploSwitch e=new EjemploSwitch();
        e.demo(99);
    }

    public void ejemplo0(int dato){
        int asistentes=dato;
        boolean valor; // asume FALSE

        if(asistentes>=5){
            valor = true;
        }else{
            valor = false;
        }

        System.out.println("asistentes >= 5 " + valor);

    }

    public void ejemplo1(){
        boolean valor=true;
        if (valor) {
            System.out.println("es verdadero");
        } else {
            System.out.println("es falso");
        }
    }

    public void ejemplo2(){
        // if reducido
        int nro=3;
        String rpta; // asume null
        rpta=(nro == 3 ) ? "SI"  : "NO"; // if reducido  -->  (logica) ? true : false
        System.out.println(rpta);
    }
}
