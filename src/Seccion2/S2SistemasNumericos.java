package Seccion2;

import javax.swing.*; // importa para utilizar JOptionPane

public class S2SistemasNumericos {
    public static void main(String[] args) {
        // para ingresar un numero por consola:
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

//        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        // Binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // para que tome como binario se antepone "0b"
        System.out.println("numeroBinario = " + numeroBinario); // lo imprime como 500

        // Octal
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; // para que tome como octal le pongo un 0 adelante
        System.out.println("numeroOctal = " + numeroOctal); // imprime 500

        // Hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4; // para que me tome como octal le pongo un 0x adelante
        System.out.println("numeroHex = " + numeroHex); // me muestra tambien 500

    }
}
