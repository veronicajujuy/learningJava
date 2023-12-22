package Seccion3;

public class S3EjemploStringJava {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);

        System.out.println("esIgual = " + esIgual);

        String curso3= "Programación Java";

        esIgual = curso == curso3; // es true porque ambos al tener un mismo valor hacen referencia al mismo objeto
        System.out.println("esIgual = " + esIgual);

        // por lo tanto nunca debemos comparar dos objetos string con ==, se usa equals o equalsIgnoreCase
    }
}
