package POO.ClasesYObjetos;

public class Carro {
    //atributos
    private int id;
    private String marca;
    private int precio;
    private String tipo;
    private static int contador;

    //constructor
    public Carro() {
        this.id = ++Carro.contador;
    }

    public Carro(String marca, int precio, String tipo) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
        this.id = ++Carro.contador;
    }

    //metodos getters y setters
    public int getId() {
        return this.id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override //este metodo sobreescribe la clase
    public String toString() {
        return "ID: " + this.id
                + "\nMarca: " + this.marca
                + "\nPrecio: " + this.precio
                + "\nTipo: " + this.tipo;
    }

}
