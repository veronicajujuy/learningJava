package Seccion5;

import javax.swing.*;

public class S5SentenciaFor {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println("i = " + i);
        }
        
        for(int i =10; i >=0; i--){
            System.out.println("i = " + i);
        }
        // utilizando 2 variables

        for (int i=1,j=10; i<j; i++,j--){
            System.out.println("i = " + i+" j = "+j);
        }

        // saltarse iteraciones: ejemplo imprimir numeros impares

        for(int i = 0; i<10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
        
        // con strings
        
        String[] nombres = {"Vero","Vani","Vane", "Sele", "Camilo"};
        System.out.println("nombres = " + nombres); // esto no muestra los datos del string
        
        for (int i=0; i < nombres.length; i++){
            System.out.println("nombres = "+i+" = " + nombres[i]);
        }

        // ejemplo con break:

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        boolean encontrado = false;

        for (int i=0; i < nombres.length; i++){
           if(nombres[i].equalsIgnoreCase(buscar)){
               encontrado = true;
               break;
           }
        }
        if (encontrado) JOptionPane.showMessageDialog(null,buscar + " fue encontrado");
        else JOptionPane.showMessageDialog(null,buscar + " no se encuentra");


    }
}
