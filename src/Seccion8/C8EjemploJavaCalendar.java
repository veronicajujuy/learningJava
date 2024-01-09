package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C8EjemploJavaCalendar {
    public static void main(String[] args) {
        // no se puede hacer new Calendar crea una instancia con getInstance
        // Crea una instancia del calendario gregoriano, pero depende de la zona horaria


        Calendar calendario = Calendar.getInstance();
        System.out.println("calendario = " + calendario.getTime());

        // seteo una fecha determinada
        // el mes 0 es enero
        calendario.set(2020, 0 , 25, 19,20, 00);
        calendario.set(2020, Calendar.DECEMBER , 25, 19,20, 00);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 05);

        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss a");
        String fechaFormateada = formato.format(fecha);

        System.out.println("fechaFormateada = " + fechaFormateada);
    }
}
