public class S2PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 22; // si no pongo el punto me toma como float
        realFloat = 22.5f; // si quiero que permanezca como float debo agregarle una f al final
        realFloat = 2.25e5f; // puedo utilizar la notacion cientifica en este caso me entrega 225000.0
        System.out.println("numeroFloat = " + realFloat);
        
        realFloat = 1.6e-10f; // puedo utilizar e- para numeros decimales, en este caso seria: 0.00000000016 pero muestra de forma compacta
        realFloat = 0.00000000015f; // aca muestra de forma compacta 1.5E-10
        System.out.println("realFloat = " + realFloat);

        System.out.println("typo de float corresponde en byte a " + Float.BYTES);
        System.out.println("typo de float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor maximo de un float " + Float.MIN_VALUE);

        double realdouble = 3.4028235E38; // por defecto cualquier numero del tipo 1.0 es double a menos que leponga una f
        System.out.println("realdouble = " + realdouble);

        System.out.println("typo de double corresponde en byte a " + Double.BYTES);
        System.out.println("typo de double corresponde en bits a " + Double.SIZE);
        System.out.println("Valor maximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor maximo de un double " + Double.MIN_VALUE);
    }

    // en el caso de los var por defecto si defino var numero = 1.0 va a ser un doble
    // tendre que decir en ese caso var numero = 1.0f para que sea un float
}
