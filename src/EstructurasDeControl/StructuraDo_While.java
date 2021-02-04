package EstructurasDeControl;

import java.util.Iterator;
import java.util.Scanner;

public class StructuraDo_While {
    static int i = 1, tablaNumero = 0, terminaTablaMultiplicar = 0, resultado = 0, edad = 0;
    static String respuesta = "";
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Bucles
        //While - do while - for - forEach

        /*
            Haz una fiesta, pero que solo puedan ingresar personas mayores a 18 años.
         */

        /*System.out.println("¿Cual tabla de multiplicar quieres sacar?");
        tablaNumero = Integer.parseInt(leer.nextLine());

        System.out.println("¿Hasta cuanto deseas que sea la tabla?");
        terminaTablaMultiplicar = Integer.parseInt(leer.nextLine());

        System.out.println("tabla de: " + tablaNumero);
        while (i <= terminaTablaMultiplicar) {
            resultado = tablaNumero * i;
            System.out.println(tablaNumero + "*" + i + "= " + resultado);
            i++;
        }*/
        /*i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i == 2);*/

        /*System.out.println("¿Alguien va a intentar ingresar?" +
                "\nSI o NO");
        respuesta = leer.nextLine();*/

        /*while (respuesta.equalsIgnoreCase("SI")) {
            System.out.println("¿Cual es tu edad?");
            edad = Integer.parseInt(leer.nextLine());

            if (edad >= 18) {
                System.out.println("Puedes pasar");
            } else {
                System.out.println("No puedes pasar");
            }

            System.out.println("¿Alguien va a intentar ingresar?" +
                    "\nSI o NO");
            respuesta = leer.nextLine();
        }*/

        do {
            System.out.println("¿Alguien va a intentar ingresar?" +
                    "\nSI o NO");
            respuesta = leer.nextLine();

            if (!respuesta.equalsIgnoreCase("NO")) {
                System.out.println("¿Cual es tu edad?");
                edad = Integer.parseInt(leer.nextLine());

                if (edad >= 18) {
                    System.out.println("Puedes pasar");
                } else {
                    System.out.println("No puedes pasar");
                }
            } else {
                break;
            }

        } while (respuesta.equalsIgnoreCase("SI"));

    }
}