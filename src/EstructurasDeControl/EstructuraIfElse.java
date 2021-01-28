package EstructurasDeControl;

import java.util.Scanner;

public class EstructuraIfElse {

    private String genero;

    public static void main(String[] args) {
        var edad = 0;

        /*Palbra reservada var => nos permite creaer variables in importar el tipo
            : porque se adapta al tipo que le pasemos*/
        var leer1 = new Scanner(System.in);
        //Estructuras de control => if
        /*
            Haz una fiesta, pero que solo puedan ingresar personas mayores a 18 años.
         */

        /*System.out.println("*-----------------*\n");

        System.out.println("Hola, dime tu nombre:");
        var nombre = leer1.nextLine();

        System.out.println(nombre + ", ¿Estas invitado a la fiesta?");
        var inivitacion = leer1.nextLine();*/

        /*equalsIgnoreCase => Ignora todos los tipos de opciones en que se puede escirbir una cadena de texto
        Ejemplo:
            Si == Si
            si != Si
            SI != Si

            Si == Si
            SI == Si
            si == Si
         */

        //if
        /*if (inivitacion.equalsIgnoreCase("Si")) {
            System.out.println("¿Cuantos años tienes?");
            edad = Integer.parseInt(leer1.nextLine());

            if (edad >= 18) {
                System.err.println("Si puedes pasar");
            }
        }

        System.out.println("Programa finalizado");*/

        //if-else

        /*if (inivitacion.equalsIgnoreCase("Si")) {
            System.out.println(nombre + ", ¿Cuantos años tienes?");
            edad = Integer.parseInt(leer1.nextLine());

            if (edad >= 18) {
                System.err.println(nombre + ", bienvenido(a) puedes pasar");
            } else {
                System.err.println(nombre + ", lamentablemente eres menor de edad, y no puedes pasar");
            }
        } else {
            System.err.println(nombre + ", al parecer no estas invitado");
        }

        System.out.println("\n------------Programa finalizado------------");*/

        //Operador ternario
        /**boolean resultado = (inivitacion.equalsIgnoreCase("Si")) ? true : false;
         System.out.println("resultado = " + resultado);*/

        /*Condiciones anidadas
        System.out.println("*-----------------*\n");

        System.out.println("Hola, dime tu nombre:");
        var nombre = leer1.nextLine();

        System.out.println(nombre + ", ¿Estas invitado a la fiesta?");
        var inivitacion = leer1.nextLine();

        if (inivitacion.equalsIgnoreCase("Si")) {
            System.out.println("Hola, " + nombre + ", dime tu genero: M => Masculino o F => Femenino");
            var genero = leer1.nextLine();

            System.out.println(nombre + ", ¿Cuantos años tienes?");
            edad = Integer.parseInt(leer1.nextLine());

            if (genero.equalsIgnoreCase("M")) {
                if (edad >= 18) {
                    System.err.println(nombre + ", bienvenido puedes pasar");
                } else {
                    System.err.println(nombre + ", lamentablemente eres menor de edad, y no puedes pasar");
                }
            } else {
                if (edad >= 18) {
                    System.err.println(nombre + ", bienvenida puedes pasar");
                } else {
                    System.err.println(nombre + ", lamentablemente eres menor de edad, y no puedes pasar");
                }
            }
        } else {
            System.err.println(nombre + ", al parecer no estas invitado");
        }

        System.out.println("\n------------Programa finalizado------------");
         */

        System.out.println("*-----------------*\n");

        System.out.println("Hola, dime tu nombre:");
        var nombre = leer1.nextLine();

        System.out.println(nombre + ", ¿Estas invitado a la fiesta?");
        var inivitacion = leer1.nextLine();

        if (inivitacion.equalsIgnoreCase("Si")) {
            System.out.println(nombre + ", bienvenido puedes pasar");
        } else if (inivitacion.equalsIgnoreCase("No")) {
            System.out.println(nombre + ", lamentablemente puedes pasar");
        } else {
            System.err.println("Al parecer ingresaste una palabra que no es la correcta");
        }
    }

    /**
     * Bloques o estructuras =>
     */
}