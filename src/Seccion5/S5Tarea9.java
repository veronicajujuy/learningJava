package Seccion5;

import java.util.Scanner;

public class S5Tarea9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros positivos o negativos");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        boolean signo = false, signoGeneral = false;
        
        int multiplicacion = 0;
        if (num1 <0 && num2 <0){
            signoGeneral = true;
        }
        if (num1 < 0) {
            num1 = -num1;
            signo = true;
        }
        if (num2 < 0) {
            num2= -num2;
            signo = true;
        }

        for(int i = 1; i<=num1;i++){
            multiplicacion +=num2;
        }
        if (signo){
            multiplicacion = -(multiplicacion);
        }
        if (signoGeneral){
            multiplicacion = -(multiplicacion);
        }
        System.out.println("multiplicacion = " + multiplicacion);



    }
}
