package Seccion4;

public class S4OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean b = false;
        
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);
        
        boolean b4 = b == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = !b;
        System.out.println("b5 = " + b5);
        
        boolean b6 = l > k;
        System.out.println("b6 = " + b6);
        
        boolean b7 = j <= k;
        System.out.println("b7 = " + b7);
        
    }
}
