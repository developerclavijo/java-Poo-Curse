package principal;

import javax.swing.*;
import java.util.Scanner;

public class EntradaDeDatos {
    //Entrada de datos
    public static void main(String[] args) {
        var leer = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        var nombre = leer.nextLine();

        System.out.println("Escribe tus apellidos");
        var apellidos = leer.nextLine();

        System.out.println("Escribe tu edad");
        var edad = Integer.parseInt(leer.nextLine());

        System.out.println("Hola, mi nombre es: " + nombre + ", y mi apellido es: " + apellidos + ", y mi edad es: " + (edad + 5));
    }
}
