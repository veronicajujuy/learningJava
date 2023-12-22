package Seccion6;

public class S6ClasesWrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("(num1 == num2) = " +  (num1 == num2)); // es true porque num2 hace referencia al mismo lugar de memoria de num1

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? = " +  (num1 == num2)); // es false porque aunque tengan el mismo valor no tienen la misma referencia

        System.out.println("Tienen el mismo valor? = " +  (num1.equals(num2))); // true
        System.out.println("Tienen el mismo valor? = " +  (num1.intValue() == num2.intValue())); // true

        // si el numero es menor o igual a 127 java compara siempre por valor no por objeto

        num1 = Integer.valueOf(127);
        num2 = 127;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? = " +  (num1 == num2)); // es false porque aunque tengan el mismo valor no tienen la misma referencia

        System.out.println("Tienen el mismo valor? = " +  (num1.equals(num2))); // true
        System.out.println("Tienen el mismo valor? = " +  (num1.intValue() == num2.intValue())); // true

    }
}
