public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo soy Vero";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if(valor){
            int numero2 = 10;
            System.out.println("numero2 = " + numero2); // solo vive dentro del if
        }
        var numero3 = 15; // tipo dinamico
        System.out.println("numero3 = " + numero3);
        String nombre;
        nombre = "Ana";
        System.out.println("nombre = " + nombre);

        // comparar por valor y referencia

        String str1 = "Hola Odin";
        String str2 = new String("Hola Odin");
        String str3 = "Hola Odin";
        String str4 = "Hola Killu";

        System.out.println("son iguales? "+ str1==str2);
        System.out.println("son iguales? "+ str1==str3);

        System.out.println("son iguales equals? "+ str1.equals(str2));
        System.out.println("son iguales equals? "+ str1.equals(str3));

        System.out.println("length "+ str1.length());
        System.out.println("comparacion "+ str1.equalsIgnoreCase(str2));
        System.out.println("comparacion "+ str1.compareTo(str4));
        System.out.println("comparacion "+ str4.compareTo(str1));

    }
}
