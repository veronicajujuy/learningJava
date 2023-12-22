package Seccion4;

public class S4OperadorInstanceOf {
    public static void main(String[] args) {
       // Estos dos son lo mismo
//     String texto = new String("Creando un objeto de la clase String");
       String texto = "Creando un objeto de la clase String";
       // no es un primitivo es una instancia del objeto Integer.
       Integer num = 7;

       boolean b1 = texto instanceof String;

       System.out.println("texto es del tipo String = " + b1);

       b1 = texto instanceof Object;

       System.out.println("texto es del tipo object = " + b1);

       boolean b2 = num instanceof Integer;
       System.out.println("num es del tipo Integer = " + b2);

        b2 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b2);

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b2);

        Double decimal = 45.54;

        Boolean b3 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b3);

        b3 = b3 instanceof Boolean;
        System.out.println("b3 es del tipo Boolean = " + b3);

        // a diferencia de los primitivos los objetos tienen metodos y atributos


    }
}
