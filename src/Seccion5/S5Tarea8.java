package Seccion5;

import java.util.Scanner;

public class S5Tarea8 {
    public static void main(String[] args) {
        double nota = 0, promedioMayor = 0, promedioMenor = 0, promedioTotal = 0;
        byte contMayor = 0, contMenor = 0;

        Scanner s = new Scanner(System.in);
        for(int i=1; i<= 20;i++){
            System.out.println("Ingrese la nota "+i+" : ");
            nota = s.nextDouble();
            if (nota == 0) break;
            promedioTotal += nota;
            if(nota > 5){
                promedioMayor += nota;
                contMayor++;
            }else if (nota < 4){
                promedioMenor +=nota;
                contMenor++;
            }
        }
        System.out.println("El promedio de notas mayores a 5 es = " + promedioMayor/contMayor);
        System.out.println("El promedio de notas menores a 4 es = " + promedioMenor/contMenor);
        System.out.println("El promedio de total de notas es = " + promedioTotal/20);
    }
}
