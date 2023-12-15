import javax.swing.*;

public class S4OperadoresAritmeticos {
    public static void main(String[] args) {
        int i=5, j=4; // se pueden definir dos variables de una sola vez cuando son del mismo tipo

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("suma = " + i + j); // aca concatena

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("resta = " + (i - j)); // no puedo poner "resta = " + i - j porque se concatena resta e i pero luego es un string que no puede restarse

        int multiplicacion = i * j;
        int division = i / j;
        System.out.println("division = " + division); // aca nos muestra 1 porque division es int
        float division2 = i/j;
        System.out.println("division2 = " + division2); // aca nos muestra 1.0 porque i y j son int
        float division3 = (float)i/j;
        System.out.println("division3 = " + division3); // ahora si da 1.25 porque se castea uno de los datos. puedo castear cualquiera o ambos
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
