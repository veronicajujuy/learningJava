package Seccion5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class S5SentenciasSwitchCase {
    public static void main(String[] args) {
        int num = 5;
        // soporta char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
        switch (num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el numero es uno");
                break;
            case 2:
                System.out.println("el numero es dos");
                break;
            default:
                System.out.println("es otro numero");
        }
        // ejemplo dias del mes

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un mes (numerico):");
        byte mes = s.nextByte();
        System.out.println("Ingrese un año YYYY");
        int anio = s.nextInt();
        byte numeroDias;

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || anio % 4 == 0 && !(anio %100 ==0)){
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        System.out.println("La cantidad de dias es "+ numeroDias);

    }
}
