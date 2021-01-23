package principal;

import java.util.Scanner;

public class Ejercicios {
    //Ejercicios
    /*
     * Implementar un programa en el cual se le pida al usuario lo siguiente:
     * Nombres y apellidos
     * Edad
     * Correo Electrónico
     * ------------------
     * Si es mayor de edad
     * Que pueda hacer calculos:
     * - Suma
     * - Resta
     * - Multiplicación
     * - División
     * - Si es par el resultado de todo
     * suma + (suma - resta) * multiplicar / dividir - (resta + suma)
     */
    public static void main(String[] args) {
        //Declaración de variables
        var leer = new Scanner(System.in);
        var nombre = "";
        var apellidos = "";
        var email = "";

        var edad = 0;

        var sumar1 = 0.0;
        var sumar2 = 0.0;
        var sumar3 = 0.0;

        var resta1 = 0.0;
        var resta2 = 0.0;

        var multiplicar = 0.0;
        var dividir = 0.0;
        var resultado = 0.0;

        var mayorEdad = false;
        var parONo = 0.0;
        var resultadoParONo = false;

        //Escritura de código
        System.out.println("Hola, bienvenido al nuestro programa");

        //Datos personales
        System.out.println("Para empezar digita tu nómbre");
        nombre = leer.nextLine();

        System.out.println("Ahora digita tus apellidos");
        apellidos = leer.nextLine();

        System.out.println("También necesitamos tu email");
        email = leer.nextLine();

        System.out.println("Para terminar necesitamos tu edad cómo dato personal");
        edad = Integer.parseInt(leer.nextLine());

        //Datos paran hacer suma, resta, división y multiplicación
        System.out.println("Ingresa el primer numero de la suma");
        sumar1 = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el segundo numero de la suma");
        sumar2 = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el tercer numero de la suma");
        sumar3 = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el primer numero de la resta");
        resta1 = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el segundo numero de la resta");
        resta2 = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el primer numero de la multiplicación");
        multiplicar = Double.parseDouble(leer.nextLine());

        System.out.println("Ingresa el primer numero de la división");
        dividir = Double.parseDouble(leer.nextLine());

        resultado = sumar1 + (sumar2 - resta1) * multiplicar / dividir - (resta2 + sumar3);
        parONo = resultado % 2;
        resultadoParONo = parONo == 0;
        mayorEdad = edad >= 18;

        System.out.println("Hola, me llamo: " + nombre + ", mis apellidos son: " + apellidos
                + ", tengo: " + edad + " y mi email es: " + email
                + "\n¿Soy mayor de edad? " + mayorEdad
                + "\nEl resultado de los calculos son: " + resultado
                + "\n¿El resultado es par? " + resultadoParONo);

    }
}