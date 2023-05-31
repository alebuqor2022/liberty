package clase3_Files;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
      File file=new File("c:\\Ale\\","hola.txt") ;
      System.out.println(file.length()); // veo el tamaño del archivo
      String s;
        // aplicando el patron de diseño DECORATOR
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            s= br.readLine();
            while(s != null) {
                System.out.println("leo .... " + s);
                s= br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
