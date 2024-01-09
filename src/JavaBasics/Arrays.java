package JavaBasics;

public class Arrays {
    public static void main(String[] args) {
        // Arreglos
        String[] androidVersions = new String[4];
        String days[] = new String[7];

        // Matrices
        String [][] cities = new  String[4][2];
        int [][][] numbers = new int[2][2][2];

        // Agregando valores

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("androidVersions = " + androidVersions[0]);
        System.out.println("androidVersions = " + androidVersions[3]);

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        cities[0][0] = "Colombia";
        cities[0][1] = "Bogotá";
        cities[1][0] = "Colombia";
        cities[1][1] = "Medellín";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        //        System.out.println("cities = " + cities[0][0]);
        //        System.out.println("cities = " + cities[0][0]);

        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println("cities = " + cities[i][j]);
            }
        }
        System.out.println("foreach");
        for (String androidVersion: androidVersions ) {
            System.out.println("androidVersion = " + androidVersion);
        }

        System.out.println("foreach mas de una dimension");

        for (String[] city: cities) {
            for (String name: city ) {
                System.out.println("name = " + name);
            }
        }
    }


}
