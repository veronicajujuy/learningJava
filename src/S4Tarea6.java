import javax.swing.*;

public class S4Tarea6 {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de un familiar o amigo");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el otro nombre y apellido de un familiar o amigo");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el otro nombre y apellido de un familiar o amigo");

        String[] nombreArray1 = nombre1.split(" ");
        String[] nombreArray2 = nombre2.split(" ");
        String[] nombreArray3 = nombre3.split(" ");

        if (nombreArray1[0].length() > nombreArray2[0].length() && nombreArray1[0].length() > nombreArray3[0].length()){
            System.out.println(nombre1.concat(" Tiene el nombre mas largo"));
        } else if(nombreArray2[0].length() > nombreArray1[0].length() && nombreArray2[0].length() > nombreArray3[0].length()){
            System.out.println(nombre2.concat(" Tiene el nombre mas largo"));
        } else {

            System.out.println(nombre3.concat(" Tiene el nombre mas largo"));
        }
    }
}
