package Seccion3;

public class S3EjemploStringJavaInmutabilidad {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Vero";

        curso.concat(" ").concat(profesor);

        System.out.println(curso);
        String resultado = curso.concat(" ").concat(profesor);

        System.out.println(resultado);

        curso.transform(c ->{return c + " " + profesor;});
        System.out.println(curso);

        resultado = curso.transform(c ->{return c + " " + profesor;});
        System.out.println(resultado);

        // los strings son inmutables
        
        // String Builder:
        StringBuilder sb = new StringBuilder(curso);
        sb.append(" ").append(profesor);
        System.out.println("sb = " + sb);

        // string builder es una forma de agregar cosas a un string, en este caso modificandolo. el String Builder no es inmutable
    }
}
