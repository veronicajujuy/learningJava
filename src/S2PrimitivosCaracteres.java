public class S2PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a'; // los tipo char son un solo caracter en comillas simples.
        
        // para los caracteres como @ hay tres formas de escribirlo:
        char arrobaUnicode = '\u0040'; // en este caso estamos usando el caracter @ con el codigo
        System.out.println("arrobaUnicode = " + arrobaUnicode);
        char arrobaDecimal = 64;
        System.out.println("arrobaDecimal = " + arrobaDecimal);
        char arrobaSimbolo = '@';
        System.out.println("arrobaSimbolo = " + arrobaSimbolo);

        /* todo lo anterior me imprime un @ */

        System.out.println("typo de char corresponde en byte a " + Character.BYTES);
        System.out.println("typo de char corresponde en bits a " + Character.SIZE);
        System.out.println("Valor maximo de un char " + Character.MAX_VALUE); // estos valores dependeran del SO
        System.out.println("Valor minimo de un char " + Character.MIN_VALUE);

    }
}
