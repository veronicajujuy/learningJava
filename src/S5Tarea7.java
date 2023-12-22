import java.util.Scanner;

public class S5Tarea7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        byte cantidad  = s.nextByte();

        Integer[] numeros = new Integer[cantidad];
        for(int i=0; i< cantidad;i++){
            System.out.println("Ingrese el numero: "+(i+1)+ ":");
            numeros[i] = s.nextInt();
        }
        int menor = Integer.MAX_VALUE;
        for(int i=0; i< cantidad;i++){
            if (numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println("El numero menor es = " + menor);
        if (menor < 10) System.out.println("El numero menor es menor que 10!");
        else  System.out.println("el numero menor es igual o mayor que 10!");

    }
}
