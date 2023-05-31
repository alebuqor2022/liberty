package clase3_Files;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

    public static void main(String args[]){
        Properties props= System.getProperties();
        Enumeration propNames=props.propertyNames();

        while(propNames.hasMoreElements()){
            String propName=(String)propNames.nextElement(); // trae el nombre
            String property=props.getProperty(propName); // trae el valor

            System.out.println("propiedad: " + propName + " = " + property );

        }
    }

}
