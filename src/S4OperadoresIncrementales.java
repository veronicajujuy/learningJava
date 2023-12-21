public class S4OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        // pre incremento
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //ambas variables valen 2

        // post incremento
        i= 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //i vale 3 y j vale 2 porque en el post incremento primero se asigna el valor a la variable y luego recién se incrementa

        // Decremento
        // pre decremento
        i= 5;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento
        i= 4;
        j = i--;
        System.out.println("i = " + i); // 3
        System.out.println("j = " + j); // 4

        // lo mismo pasa con el decremento

        System.out.println("(++j) = " + (++j)); // j valía 4 ahora vale 5
        System.out.println("j++ = " + j++); // j vale 6 pero muestra 5 porque el valor se le asigna luego de la impresion
        System.out.println("j = " + j); // j vale 6
    }
}
