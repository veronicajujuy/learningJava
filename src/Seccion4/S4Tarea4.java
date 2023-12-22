package Seccion4;

import java.util.Scanner;

public class S4Tarea4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = s.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = s.nextInt();
        
        int mayor = numero1 > numero2 ? numero1 : numero2;
        System.out.println("mayor = " + mayor);
        
    }
}
