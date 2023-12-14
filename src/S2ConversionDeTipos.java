public class S2ConversionDeTipos {
    public static void main(String[] args) {
        // conversion de String a datos primitivos

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "92.6357e-3";
        double numeroReal = Double.parseDouble(realStr);
        System.out.println("numeroReal = " + numeroReal);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // conversion de primitivos a cadenas
        // Entero
        int otroNumeroInt = 100;
        
        String otroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroStr = " + otroStr);
        
        otroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroStr = " + otroStr);

        // Double
        double numDouble = 123564e-2;
        String doubleString = Double.toString(numDouble);
        System.out.println("doubleString = " + doubleString);

        doubleString = String.valueOf(numDouble);
        System.out.println("doubleString = " + doubleString);
        
        doubleString = String.valueOf(123.45f);
        System.out.println("doubleString = " + doubleString);

        // conversion de primitivos a otros primitivos
        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = (long) i;
        System.out.println("l = " + l);
        
        i = 42767;
        s = (short) i;
        System.out.println("s = " + s);
        
        double d = i;
        System.out.println("d = " + d);
        
        float f = i;
        System.out.println("f = " + f);
    }
}
