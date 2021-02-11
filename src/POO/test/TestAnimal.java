package POO.test;

import POO.ClasesYObjetos.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        var gato = new Animal("Minino", "Gato", "Marrón");
        System.out.println(gato);

        System.out.println("----------------------------------");

        var perro = new Animal("Firualis");
        gato.comer();

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + gato.getNombre()
                + "\nTipo: " + gato.getTipo()
                + "\nColor: " + gato.getColor());

        System.out.println("----------------------------------");
        gato.dormir();
        gato.setColor("Anaranjado");

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + gato.getNombre()
                + "\nTipo: " + gato.getTipo()
                + "\nColor: " + gato.getColor());

        System.out.println("----------------------------------");
        System.out.println("Nombre: " + perro.getNombre()
                + "\nTipo: " + perro.getTipo()
                + "\nColor: " + perro.getColor());

        perro.setTipo("Perro");
        perro.setColor("Manchado");
        System.out.println("----------------------------------");
        System.out.println("Nombre: " + perro.getNombre()
                + "\nTipo: " + perro.getTipo()
                + "\nColor: " + perro.getColor());
    }
}
