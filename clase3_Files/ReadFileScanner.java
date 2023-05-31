package clase3_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner{
    public static void main(String[] args)  {

        try {
            Scanner sc=new Scanner(new File("c:\\Ale\\in.txt"));
            String nombre=null;
            int cant=0;
            float costo=0f;
            while(sc.hasNext()){
                nombre=sc.next();
                cant=sc.nextInt();
                costo=sc.nextFloat();
                System.out.println(nombre + " hay " + cant + " a un costo de: " + costo);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
