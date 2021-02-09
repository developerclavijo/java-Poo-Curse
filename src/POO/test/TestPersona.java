package POO.test;

import POO.ClasesYObjetos.Persona;

public class TestPersona {
    public static void main(String[] args) {
        //Esta en una parte de la memoria
        Persona juan = new Persona("Juan", "Aleman", 20, "2000-01-01");

        //Esta en otra parte de la memoria
        var maria = new Persona("María", "De la torre", 24, "2000-01-01");

        //otra persona
        Persona marcelo = new Persona("Marcelo", "Cabral", 40, "1980-08-17");

        var juana = new Persona();

        System.out.println("--------------------");

        Persona Gerardo = new Persona("Gerardo");

        System.out.println("-------- Juan ------------");

        System.out.println("Nombre: " + juan.nombre +
                "\nApellido: " + juan.apellidos
                + "\nEdad: " + juan.edad
                + "\nNacimiento: " + juan.fechaNacimiento);

        System.out.println("-------- Juan ------------");

        juan.nombre = "Martín";

        System.out.println("Nombre: " + juan.nombre +
                "\nApellido: " + juan.apellidos
                + "\nEdad: " + juan.edad
                + "\nNacimiento: " + juan.fechaNacimiento);

        System.out.println("--------- Maria -----------");

        System.out.println("Nombre: " + maria.nombre +
                "\nApellido: " + maria.apellidos
                + "\nEdad: " + maria.edad
                + "\nNacimiento: " + maria.fechaNacimiento);

        System.out.println("--------- Maria -----------");
        maria.edad = 18;

        System.out.println("Nombre: " + maria.nombre +
                "\nApellido: " + maria.apellidos
                + "\nEdad: " + maria.edad
                + "\nNacimiento: " + maria.fechaNacimiento);

        System.out.println("--------- Marcelo -----------");

        System.out.println("Nombre: " + marcelo.nombre +
                "\nApellido: " + marcelo.apellidos
                + "\nEdad: " + marcelo.edad
                + "\nNacimiento: " + marcelo.fechaNacimiento);

    }
}
