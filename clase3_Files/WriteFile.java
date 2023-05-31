package clase3_Files;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        File file=new File("C:\\Ale\\","chau.txt");
        String s;
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out= new PrintWriter(new FileWriter(file)) ; // con true, hacemos append, o sea agregamos
            System.out.println("tipee algo: ");

            while( (s=br.readLine()) != null){
                out.println(s);
                if (s=="1"){
                    System.exit(0);
                }
            }
            br.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
