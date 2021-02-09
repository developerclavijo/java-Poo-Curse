package POO.ClasesYObjetos;

public class Persona {
    //Atributos
    public String nombre;
    public String apellidos;
    public int edad;
    public String fechaNacimiento;

    //contructor
    public Persona(String nom, String ape, int age, String nacimiento) {
        nombre = nom;
        apellidos = ape;
        edad = age;
        fechaNacimiento = nacimiento;
    }

    //sobre carga de constructores
    public Persona() {
        System.out.println("Sin atributos");
    }

    public Persona(String nom) {
        nombre = nom;
        System.out.println("nom = " + nom);
    }

    //funciones
    public void comer() {
        System.out.println("Wstoy comiendo");
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

}
