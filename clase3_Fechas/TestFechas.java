package clase3_Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class TestFechas {
    public static void main(String[] args) {

        ejemplo0();
       // ejemplo1();
    }
    public static void ejemplo0() {
        LocalDate fecha1=LocalDate.of(2024, 6, 11);
        System.out.println(fecha1.isLeapYear() + " bisiesto");

        DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fecha2="2017/03/22";
        // convierto String a LocalDate
        LocalDate fecha3=LocalDate.parse(fecha2, format);
        System.out.println("local date es " + fecha3);
    }

    public static void ejemplo1() {
        Date miFecha = new Date();
        System.out.println(miFecha);

        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime().getHours());
        GregorianCalendar ahora=new GregorianCalendar();
        System.out.println(ahora.getTime().getHours());

        int mes= ahora.get(Calendar.MONTH);
        int diaSem= ahora.get(Calendar.DAY_OF_WEEK);
        System.out.println("mes: " + mes + " dia: " + diaSem);
    }
}