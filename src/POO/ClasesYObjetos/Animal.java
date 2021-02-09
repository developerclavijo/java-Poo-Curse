package POO.ClasesYObjetos;

public class Animal {
    //atributos
    public String nombre;
    public String tipo;
    public String color;

    //constructor
    public Animal() {

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
}
