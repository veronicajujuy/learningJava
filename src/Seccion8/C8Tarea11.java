package Seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C8Tarea11 {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en el formato \"dd-MM-yyyy\"");
        try {
            Date fecha = formato.parse(s.next());
            Date fechaActual = new Date();
            Long Diferencia = fechaActual.getTime() - fecha.getTime();
            System.out.println("Diferencia " + Diferencia/10000);
            
            char n = '1';
            int nN = n;
            System.out.println("nN = " + nN);
            nN = (int) n;
            System.out.println("nN = " + nN);
            System.out.println("nN = " + nN);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
