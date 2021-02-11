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

        System.out.println("Nombre: " + juan.getNombre() +
                "\nApellido: " + juan.getApellidos()
                + "\nEdad: " + juan.getEdad()
                + "\nNacimiento: " + juan.getFechaNacimiento());

        System.out.println("-------- Juan ------------");

        juan.setNombre("Martín");

        System.out.println("Nombre: " + juan.getNombre() +
                "\nApellido: " + juan.getApellidos()
                + "\nEdad: " + juan.getEdad()
                + "\nNacimiento: " + juan.getFechaNacimiento());

        System.out.println("--------- Maria -----------");

        System.out.println("Nombre: " + maria.getNombre() +
                "\nApellido: " + maria.getApellidos()
                + "\nEdad: " + maria.getEdad()
                + "\nNacimiento: " + maria.getFechaNacimiento());

        System.out.println("--------- Maria -----------");
        maria.setEdad(18);

        System.out.println("Nombre: " + maria.getNombre() +
                "\nApellido: " + maria.getApellidos()
                + "\nEdad: " + maria.getEdad()
                + "\nNacimiento: " + maria.getFechaNacimiento());

        System.out.println("--------- Marcelo -----------");

        System.out.println("Nombre: " + marcelo.getNombre() +
                "\nApellido: " + marcelo.getApellidos()
                + "\nEdad: " + marcelo.getEdad()
                + "\nNacimiento: " + marcelo.getFechaNacimiento());
    }
}
