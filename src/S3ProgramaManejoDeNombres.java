import java.util.Scanner;

//La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
//Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
//Se pide por cada nombre de la persona:
// una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
//Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
//Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
//  N.es_A.ia_E.pe

public class S3ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres miembros de la familia:");
        System.out.println("Integrante 1:");
        String familia1 = scanner.nextLine();
        String familiaModificado1 = familia1.substring(1,2).toUpperCase().concat(".").concat(familia1.substring(familia1.length()-2));
        System.out.println("Integrante 2:");
        String familia2 = scanner.nextLine();
        String familiaModificado2 = familia2.substring(1,2).toUpperCase().concat(".").concat(familia2.substring(familia2.length()-2));
        System.out.println("Integrante 3:");
        String familia3 = scanner.nextLine();
        String familiaModificado3 = familia3.substring(1,2).toUpperCase().concat(".").concat(familia3.substring(familia3.length()-2));

        System.out.println("familiaModificado1 = " + familiaModificado1);
        System.out.println("familiaModificado2 = " + familiaModificado2);
        System.out.println("familiaModificado3 = " + familiaModificado3);
        
        String stringFamilia = familiaModificado1.concat("_").concat(familiaModificado2).concat("_").concat(familiaModificado3);
        System.out.println("stringFamilia = " + stringFamilia);

        // Ejemplo del instructor:


            System.out.println("Ingrese un nombre de un familiar:");
            String nombreA = scanner.nextLine();
            String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

            System.out.println("Ingrese otro nombre de un familiar:");
            String nombreB = scanner.nextLine();
            String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

            System.out.println("Ingrese otro nombre de un familiar:");
            String nombreC = scanner.nextLine();
            String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

            String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

            System.out.println(resultado);



    }
}
