package Clases;

import java.util.Locale;

public class ClasesJava {
    //Atributos
    int a = 1;

    //metodos
    public static void hacerAlgo() {
        System.out.println("Esta clase hace algo");
    }

    //clase principal
    public static void main(String[] args) {
        var raiz = Math.sqrt(4);
        var pi = Math.PI;
        var numeroEleveado = Math.pow(4, 2);
        var numeroAleatorio = Math.random();
        var numero = Math.round(20.4F);

        System.out.println("raiz = " + raiz); //Raiz cuadrada
        System.out.println("pi = " + pi); //Valor3 de pi
        System.out.println("numeroEleveado = " + numeroEleveado); //elevar al cuadrado
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        System.out.println("numero = " + numero);

        /////////////////////////////// String
        String hola = "               Hola               ";
        System.out.println("hola = " + hola.trim());
        System.out.println("hola = " + hola.trim().toUpperCase());
        System.out.println("hola = " + hola.trim().toLowerCase());
        System.out.println("hola = " + hola.trim().concat(" ¿Cómo estas?"));
        System.out.println("hola = " + hola.trim() + " ¿Cómo estas?");
        System.out.println("hola = " + hola.trim().repeat(5));

        System.out.println("--------------");
        System.out.println("hola = " + hola.trim().replaceAll("Hola", "Hola que tal"));
        System.out.println("hola = " + hola.trim().replace('H', 'A'));
        System.out.println("hola = " + hola.trim().indexOf("l"));
        System.out.println("hola = " + hola.trim().length());
        System.out.println("hola = " + hola.isEmpty());
        System.out.println("hola = " + hola.trim().equalsIgnoreCase("hola"));
        System.out.println("hola = " + hola.trim().equals("hola"));
    }
}
