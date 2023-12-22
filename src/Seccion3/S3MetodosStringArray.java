package Seccion3;

public class S3MetodosStringArray {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        // convierte a un array pero muestra el identificador (hash) del objeto. para mostrar hay que usar un for...
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char[] arreglo = trabalenguas.toCharArray(); // este es el arreglo de caracteres
        System.out.println("arreglo = " + arreglo);

        // en el for el length es una propiedad mientras que en String es un metodo
        for (int i= 0; i < arreglo.length; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }
        
        String cadena = "Manzana, naranja, uva, pera, ananá";
        String[] frutas = cadena.split(",");

        // aca tambien nos va a imprimir la referencia
        System.out.println("frutas = " + frutas);
        for (int i=0; i<frutas.length; i++){
            System.out.println(frutas[i]);
        }

        String archivo = "algun.archivo.jpg";
        String[] archivoArr = archivo.split("[.]"); // o tambien archiv.split("\\.");

        for (int i=0; i<archivoArr.length; i++){
            System.out.println(archivoArr[i]);
        }


    }
}
