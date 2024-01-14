package Seccion12;

import java.util.Arrays;

public class S12Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        System.out.println("numeros[3] = " + numeros[3]);

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("numeros[i]; = " + numeros[i]);
        }
        for (int numero: numeros) {
            System.out.println("numero = " + numero);
        }

        String[] productos = new String[5];
        productos[0] = "Vaso";
        productos[1] = "Celular";
        productos[2] = "Lapicera";
        productos[3] = "Casco";
        productos[4] = "Microfono";

        // si no asigno un elemento al array por defecto es null cuando es de tipo String

        for (String producto: productos) {
            System.out.println("producto = " + producto);
        }
        
        // para ordenar un arreglo puedo utilizar Arrays.sort de java.utils
        Arrays.sort(productos);
        for (String producto: productos) {
            System.out.println("producto = " + producto);
        }








    }
}
