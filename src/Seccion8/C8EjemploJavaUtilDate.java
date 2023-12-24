package Seccion8;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C8EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        
        Date fecha2 = new Date();
        // returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
        Long fechaGetTime = fecha2.getTime();
        System.out.println("fechaGetTime = " + fechaGetTime);
    }
}
