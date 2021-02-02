package EstructurasDeControl;

import java.util.Scanner;

public class StructuraSwitch {
    //Scope global
    static Scanner leer;
    static String invitacion = "No", nom = "", ape = "";
    static int edad = 17;
    static char genero = 'M';

    public static void main(String[] args) {
        //Estructura Switch

        /*
            Haz una fiesta, pero que solo puedan ingresar personas mayores a 18 años.
         */
        /*
            Declarar variables => Códificar o hacer la lógica del programa
            (Testeo, Prueba de errores y mucho mas) => ejecutar el programa
        */
        //Variables u Objetos
        leer = new Scanner(System.in);

        //Lógica
        System.out.println("Hola, identificate, ¿cual es tu nómbre?");
        nom = leer.nextLine();

        System.out.println(nom.trim() + " ¿cuales son tus apellidos?");
        ape = leer.nextLine();

        System.out.println(nom + " " + ape.trim() + "¿Cual es tu genero?" +
                "\nSi es masculino pon: M" +
                "\nSi es femenino pon: F");
        genero = leer.nextLine().charAt(0);

        switch (genero) {
            case 'M':
            case 'm':
                System.out.println(nom + " " + ape + " ¿Estas invitado?");
                invitacion = leer.nextLine();

                switch (invitacion.toUpperCase()) {
                    case "SI":
                        System.out.println(nom + ", ¿cuantos años tienes?");
                        edad = Integer.parseInt(leer.nextLine());

                        if (edad >= 18) {
                            System.out.println(nom + " " + ape + ", felicidades, puedes pasar");
                        } else {
                            System.out.println(nom + " " + ape + ", al parecer no cumples con los requisitos, " +
                                    "no puedes pasar");
                        }

                        break;
                    case "NO":
                        System.out.println(nom + " " + ape + ", al parecer no estas invitado, y no puedes pasar");
                        break;
                    default:
                        System.out.println("Haz ingresado la palabra incorrecta");
                        break;
                }
                break;
            case 'F':
            case 'f':
                System.out.println(nom + " " + ape + " ¿Estas invitada?");
                invitacion = leer.nextLine();

                switch (invitacion.toUpperCase()) {
                    case "SI":
                        System.out.println(nom + ", ¿cuantos años tienes?");
                        edad = Integer.parseInt(leer.nextLine());

                        if (edad >= 18) {
                            System.out.println(nom + " " + ape + ", felicidades, puedes pasar");
                        } else {
                            System.out.println(nom + " " + ape + ", al parecer no cumples con los requisitos, " +
                                    "no puedes pasar");
                        }

                        break;
                    case "NO":
                        System.out.println(nom + " " + ape + ", al parecer no estas invitada, y no puedes pasar");
                        break;
                    default:
                        System.out.println("Haz ingresado la palabra incorrecta");
                        break;
                }
                break;

            default:
                System.out.println("Al parecer pusiste la letra equivocada");
                break;
        }
    }
}