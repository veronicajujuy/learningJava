package Seccion7;

public class S7PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);
        test(i);
        System.out.println("cambio el valor de i? = " + i);
        // el valor no cambia porque al ser primitivos pasa el valor de la variable no la referencia.

        Integer num1 = 22;
        test2(num1);
        System.out.println("cambio el valor de num1? = " + num1);
        // aca el valor tampoco cambio porque cuando hago i=35, lo que hago es crear una nueva instancia de i
        // Recordar que las clases wrapper son inmutables

    }
    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i=35;
        System.out.println("Ahora el valor de i en test es = " + i);
    }

    public static void test2(Integer i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i=35;
        System.out.println("Ahora el valor de i en test es = " + i);
    }
}

