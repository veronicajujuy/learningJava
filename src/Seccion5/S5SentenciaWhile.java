package Seccion5;

public class S5SentenciaWhile {
    public static void main(String[] args) {
        int i=0;
        while (i<5){
            System.out.println("i = " + i);
            i++;
        }

        boolean prueba = true;
        i=0;
        while(prueba){
            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        // do while
        prueba = false;

        do{
            System.out.println("esto se ejecuta una vez");
        }while (prueba);
    }
}
