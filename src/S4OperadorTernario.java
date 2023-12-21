public class S4OperadorTernario {
    public static void main(String[] args) {
        // variable = condicion ? si es verdadero : si es falso

        String variable = 7 == 7 ? "es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.49 ? "Aprobado": "Desaprobado";
        System.out.println("estado = " + estado);
    }
}
