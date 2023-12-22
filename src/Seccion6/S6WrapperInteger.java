package Seccion6;

public class S6WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        // como transformo un primitivo en una clase wrapper integer

        Integer intObjeto = Integer.valueOf(intPrimitivo); // forma explicita de crear un objeto tipo Integer
        Integer intObjeto2 = 32768; // forma implicita de tomar un primitivo y crear un objeto tipo Integer
        System.out.println("intObjeto2 = " + intObjeto2);

        // como transformar un objeto en un primitivo:
        int num = intObjeto2; // forma implicita
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue(); // forma explicita
        System.out.println("num2 = " + num2);
        
        // transformaciones desde otros tipos de datos:
        String valorStr = "67000";
        Integer valor = Integer.valueOf(valorStr);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue(); // convertir a tipo short
        System.out.println("shortObjeto = " + shortObjeto); // si short no soporta el numero integer puede darnos cualquier valor no el correcto

        Byte byteObjeto = intObjeto.byteValue();// convertir a tipo byte
        System.out.println("byteObjeto = " + byteObjeto); // aca si es mayor a 127 nos da 0 o cualquier valor no correcto
        
        Long longObjeto = intObjeto.longValue(); // convertir a tipo long
        System.out.println("longObjeto = " + longObjeto);
                

    }
}
