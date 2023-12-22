package Seccion6;

public class S6Wrapper {
    public static void main(String[] args) {
        Character c = Character.valueOf('A');

        String str = c.toString();

        System.out.println("str = " + str);
        char c2 = c.charValue(); //'A'
        System.out.println("c2 charValue = " + c2);
        char c3 = Character.toLowerCase(c); //'a'
        System.out.println("c3 toLowerCase = " + c3);
        boolean b = Character.isDigit(c); // false
        System.out.println("c is digit? = " + b);
        boolean b2 = Character.isAlphabetic(c); // true
        System.out.println("c is alphabetic? = " + b2);
        boolean b3 = Character.isUpperCase(c); // true
        System.out.println("c is uppercase? = " + b3);
        boolean b4 = Character.isLowerCase(c); // false
        System.out.println("c is lowercase? = " + b4);
        boolean b5 = Character.isLetter(c); // true
        System.out.println("c is letter? = " + b5);
        boolean b6 = Character.isSpaceChar(c); // false
        System.out.println("c is spacechar? = " + b6);
        boolean b7 = Character.isSpaceChar(' '); // true
        System.out.println("' ' is spacechar? = " + b7);
        boolean b8 = Character.isDigit('7'); // true
        System.out.println("7 is digit? = " + b8);
    }
}
