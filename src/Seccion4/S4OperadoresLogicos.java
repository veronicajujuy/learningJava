package Seccion4;

public class S4OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean b = false;
        
        boolean b1 = i == j && k >l;
        System.out.println("b1 = " + b1); // false

        // se analiza primero la parte derecha del and si es falsa ya no se analiza la siguiente expresion

        boolean b2 = i == j || k >l; // true
        System.out.println("b2 = " + b2);

        // al ser la primera true, ya la segunda expresión no se evalúa.

        boolean b3 = i != j && k > l || b == false; // true
        System.out.println("b3 = " + b3);

        // en este caso se analiza de izquierda a derecha. El and me da false pero despues de analiza con el or y la expresion me da true

        boolean b4 = i != j && (k > l || b == false); // false
        System.out.println("b4 = " + b4);

        // precedencias

        boolean b5 = i == j || k < l && b == true;
        System.out.println("b5 = " + b5);

        // en este caso se analiza de izquierda a derecha pero el operador && tiene precedencia por sobre el ||,
        // por lo tanto k > l && b == true es false pero al analizar luego el or hace que la expresion sea true
        
        boolean b6 = true || true && false;
        System.out.println("b6 = " + b6); // true
        
        boolean b7 = true || false && false || true;
        System.out.println("b7 = " + b7); // true
    }
}
