package JavaBasics;

public class Funciones {
    public static void main(String[] args) {
        double area = circleArea(10);
        System.out.println("area = " + area);

        System.out.println("Conversion de 1000 pesos Arg a dolar "+ currencyToDolar(1000, "ARS"));
        System.out.println("Conversion de 1000 pesos Mex a dolar "+ currencyToDolar(1000, "MXN"));
        System.out.println("Conversion de 1000 pesos Col a dolar "+ currencyToDolar(1000, "COP"));
    }
    public static double circleArea(int r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Es una función que especificando una moneda en particular, convierte una cantidad a dólares.
     * @param quantity Cantidad de dinero
     * @param currency tipo de moneda, solo acepta pesos mexicanos, "MNX", pesos argentinos "ARS" o pesos colombianos "COP"
     * @return quantity devuelve la cantidad expresada en dólares.
     * */
    public static double currencyToDolar(double quantity, String currency){
        switch (currency){
            case "MXN": quantity *= 0.059;
            break;
            case "ARS": quantity *= 0.0012;
            break;
            case "COP": quantity *= 0.00026;
            break;
        }
        return  quantity;
    }
}

