package Seccion6;

public class S6AutoboxingInteger {
    public static void main(String[] args) {
        // array de numeros Integer
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12};

        int suma = 0; // valor suma es primitivo

        // acá sumamos el valor primitivo de i (para lo que hacemos i.intValue() a suma
        for(Integer i: enteros){
            if(i.intValue() %2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        suma = 0;
        // pero tambien lo podemos hacer de forma implícita
        for(Integer i: enteros){
            if(i %2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
