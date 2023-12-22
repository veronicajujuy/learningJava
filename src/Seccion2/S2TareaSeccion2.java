package Seccion2;

import java.util.Scanner;

public class S2TareaSeccion2 {
    public static void main(String[] args) {
       /* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
       se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
           Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
           Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
           Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
           Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
           Por ejemplo, el resultado podría ser algo así:
              La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura o descripcion");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese dos precios de productos: Primer precio");
        Double primerPrecio = scanner.nextDouble();
        System.out.println("Ingrese dos precios de productos: Segundo precio");
        Double segundoPrecio = scanner.nextDouble();
        Double suma = (primerPrecio + segundoPrecio);
        Double total =  suma + suma * 0.19;

        String mensaje = "La factura "+ nombreFactura +" tiene un total bruto de"+ suma;
        mensaje += " con un impuesto de"+ suma * 0.19 +" y el monto después de impuesto es de "+ total;
        System.out.println(mensaje);


    }
}
