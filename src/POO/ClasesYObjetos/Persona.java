package POO.ClasesYObjetos;

public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String fechaNacimiento;

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

    //getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //funciones
    public void comer() {
        System.out.println("Wstoy comiendo");
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

}
