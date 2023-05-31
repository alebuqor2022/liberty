package clase3_Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestTeclado {

    public static void main(String args[]){
      //  ejemplo1();
        ejemplo2();
    }

    static void ejemplo1(){
        String s;
        // Patron de diseño llamado DECORATOR
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("tipee algo: ");
        // leo 1 linea
        try {
            s= br.readLine();
            System.out.println("eco .... " + s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // leo hasta que el usuario se canse
        System.out.println("tipee algo mas y presione CTRL-Z: ");
        try {
            s= br.readLine();
            while(s != null) {
                System.out.println("eco .... " + s);
                s= br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void ejemplo2(){
        System.out.println("tipee algo: ");
        Scanner sc=new Scanner(System.in);
        String valor=sc.next();
        System.out.println("eco: " + valor);
        int valor2=sc.nextInt();
        System.out.println("eco: " + valor2);
        sc.close();

    }
}
