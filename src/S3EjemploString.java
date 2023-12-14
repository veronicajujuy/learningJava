public class S3EjemploString {
    public static void main(String[] args) {
        // me permite sacar la extension de un archivo
        String archivo = "alguna_imagen.js";
        
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}
