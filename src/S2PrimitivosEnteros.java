public class S2PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("typo de byte corresponde en byte a " + Byte.BYTES);
        System.out.println("typo de byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor maximo de un byte " + Byte.MIN_VALUE);

        short numeroShort= 30000;
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("typo de short corresponde en byte a " + Short.BYTES);
        System.out.println("typo de short corresponde en bits a " + Short.SIZE);
        System.out.println("Valor maximo de un byte " + Short.MAX_VALUE);
        System.out.println("Valor maximo de un byte " + Short.MIN_VALUE);

        int numeroInt = 30000;
        System.out.println("numeroInt= " + numeroInt);
        System.out.println("typo de int corresponde en byte a " + Integer.BYTES);
        System.out.println("typo de int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor maximo de un byte " + Integer.MAX_VALUE);
        System.out.println("Valor maximo de un byte " + Integer.MIN_VALUE);

        long longInt = 3000000000L; // se pone una L al final
        System.out.println("longInt= " + longInt);
        System.out.println("typo de int corresponde en byte a " + Long.BYTES);
        System.out.println("typo de int corresponde en bits a " + Long.SIZE);
        System.out.println("Valor maximo de un byte " + Long.MAX_VALUE);
        System.out.println("Valor maximo de un byte " + Long.MIN_VALUE);

        var numeroVar = 3000000000L;
        System.out.println("numeroVar = " + numeroVar); // cuando defino un var numerico depende que longitud le de.
    }
    
    
}
