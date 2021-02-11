package POO.ClasesYObjetos;

public class Animal {
    //atributos
    private String nombre;
    private String tipo;
    private String color;

    //constructor
    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //este, esto , esta
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, String tipo, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public void dormir() {
        System.out.println("Estoy durmiendo");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre
                + "\nTipo: " + this.tipo
                + "\nColor: " + this.color;
    }
}
