package EstructurasDeControl;

import java.util.Iterator;
import java.util.Scanner;

public class StructuraDo_While {
    static int i = 1, tablaNumero = 0, terminaTablaMultiplicar = 0, resultado = 0;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Bucles
        //While - do while - for - forEach

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
        i = 0;

        do {
            i++;

            System.out.println("Hola, soy: " + i);
            System.out.println("XD");
        } while (i == 0);
    }
}