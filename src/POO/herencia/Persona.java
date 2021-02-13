package POO.herencia;

public class Persona {
    protected int identidad;
    protected String nombre;
    protected String apellido;
    protected String trabajo;

    public Persona() {

    }

    public Persona(int identidad, String nombre, String apellido, String trabajo) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void trabar() {
        System.out.println("Esta persona, trabaja");
    }

    public void comer() {
        System.out.println("Esta persona, come");
    }

    public void dormir() {
        System.out.println("Esta persona duerme");
    }

    @Override
    public String toString() {
        return "Identidad: " + this.identidad
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\nTrabajo: " + this.trabajo;
    }
}
