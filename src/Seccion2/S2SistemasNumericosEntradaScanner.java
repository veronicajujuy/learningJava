package Seccion2;

import java.util.Scanner;

public class S2SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        // para ingresar un numero por consola:
        Scanner scanner = new Scanner(System.in); // nueva clase scanner adentro del parametro System.in entrada del sistema
        System.out.println("Ingrese un numero entero");

        int numeroDecimal = scanner.nextInt();

//        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        // Binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        // Octal
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        // Hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

    }
}
