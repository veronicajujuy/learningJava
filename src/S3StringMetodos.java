import javax.lang.model.SourceVersion;

public class S3StringMetodos {
    public static void main(String[] args) {
        String nombre = "Vero";
        System.out.println("nombre = " + nombre.length()); // imprime la cantidad de caracteres
        System.out.println("nombre = " + nombre.toUpperCase()); // imprime en mayusculas
        System.out.println("nombre = " + nombre.toLowerCase()); // imprime en minusculas
        System.out.println("nombre = " + nombre.equals("Vero")); // compara los valores
        System.out.println("nombre = " + nombre.equalsIgnoreCase("vero")); // compara los valores sin tener en cuenta las may o min
        System.out.println("nombre = " + nombre.compareTo("Vero")); // compara los strings pero teniendo en cuenta la tabla UNICODE, si es 0 son iguales
        // compara los strings pero teniendo en cuenta la tabla UNICODE, si es un numero positivo, nombre es posterior, sino es anterior
        System.out.println("nombre = " + nombre.compareTo("Vani"));
        System.out.println("nombre = " + nombre.charAt(0)); // devuelve un caracter en la posicion 0
        System.out.println("nombre = " + nombre.charAt(nombre.length()-1)); // devuelve un caracter en la posicion final
        // substring si pasamos un parametro, debemos poner primero, en este caso desde 1 en adelante
        System.out.println("nombre = " + nombre.substring(1));
        // si pasamos dos parametros, es desde la posicion 1 hasta la 2, el 3 no se incluye
        System.out.println("nombre = " + nombre.substring(1,3));

        String trabalenguas = "trabalenguas";
        // replace reemplaza todas las ocurrencias del primer parametro por el segundo
        System.out.println("trabalenguas.replace(\"a\",\"A\") = " + trabalenguas.replace("a","A"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        // contains devuelve true si contiene la cadena de caracteres pasada como argumento
        System.out.println("trabalenguas.contains(\"al\") = " + trabalenguas.contains("al"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endWith(\"tr\") = " + trabalenguas.endsWith("tr"));
        // recortar los espacios anteriores y posteriores
        System.out.println("  trabalenguas  ssss  ".trim());

    }
}
