package Seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C8EjemploParseoDate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el formato \"yyyy-MM-dd\"");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha = " + format.format(fecha));
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("fecha ingresada por el usuario es posterior a fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha ingresada por el usuario es anterior a fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha ingresada por el usuario es igual a fecha actual");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
