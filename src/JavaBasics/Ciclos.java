package JavaBasics;

public class Ciclos {
    public static void main(String[] args) {
        // Ejemplo de break
        System.out.println("Ejemplo de break");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        // Ejemplo de continue
        System.out.println("Ejemplo de continue");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
