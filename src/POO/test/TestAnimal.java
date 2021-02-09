package POO.test;

import POO.ClasesYObjetos.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        var gato = new Animal("Minino", "Gato", "Marrón");
        var perro = new Animal("Firualis");
        gato.comer();

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + gato.nombre
                + "\nTipo: " + gato.tipo
                + "\nColor: " + gato.color);

        System.out.println("----------------------------------");
        gato.dormir();
        gato.color = "Anaranjado";

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + gato.nombre
                + "\nTipo: " + gato.tipo
                + "\nColor: " + gato.color);

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + perro.nombre
                + "\nTipo: " + perro.tipo
                + "\nColor: " + perro.color);

        perro.tipo = "Perro";
        perro.color = "Manchado";
        System.out.println("----------------------------------");
        System.out.println("Nombre: " + perro.nombre
                + "\nTipo: " + perro.tipo
                + "\nColor: " + perro.color);
    }
}
