package POO.arreglos;

import POO.ClasesYObjetos.Persona;

public class TestArreglos {
    //Arreglos unidimensionales
    public static void main(String[] args) {
        String[] nombres = new String[3];

        nombres[0] = "Juan";
        nombres[1] = "Marta";
        nombres[2] = "Ana";

        for (var i = 0; i < nombres.length; i++) {
            System.out.println("Nombres " + i + ": " + nombres[i]);
        }

        System.out.println("-------------------");

        int[] edades = new int[4];
        edades[0] = 24;
        edades[1] = 20;
        edades[2] = 20;
        edades[3] = 18;

        for (var i = 0; i < edades.length; i++) {
            System.out.println("Edades " + i + ": " + edades[i]);
        }

        System.out.println("-------------------");

        boolean[] booleans = new boolean[2];
        booleans[0] = true;
        booleans[1] = false;

        for (var i = 0; i < booleans.length; i++) {
            System.out.println("Booleans " + i + ": " + booleans[i]);
        }

        System.out.println("-------------------");

        //Arreglos de objetos
        Persona abdiel = new Persona("Abdiel", "Rodriguez", 24, "2000-01-01");
        Persona hector = new Persona("Hector", "Cervantes", 20, "2000-01-01");
        Persona gerardo = new Persona("Gerardo", "Hernandez", 20, "2000-01-01");
        Persona shirley = new Persona("Shirley", "Chamby", 20, "2000-01-01");

        Persona[] personas = new Persona[4];
        personas[0] = abdiel;
        personas[1] = hector;
        personas[2] = gerardo;
        personas[3] = shirley;


        for (var i = 0; i < personas.length; i++) {
            System.out.println("Personas " + i + ": " + personas[i]);
        }
    }
}
