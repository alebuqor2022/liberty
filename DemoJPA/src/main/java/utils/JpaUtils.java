package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    private static EntityManagerFactory emf;

    static{
        try {
            emf = Persistence.createEntityManagerFactory("DemoJPA");
        }catch (Throwable e){
            System.out.println("la factoria no se pudo inicializar " + e.getMessage());
        }
    }

    public static EntityManagerFactory getEmf(){
        return emf;
    }

}
