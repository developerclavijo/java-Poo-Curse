package POO.ventas;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private static int contador;
    private String tipo;

    private Producto() {
        this.id = ++Producto.contador;
    }

    public Producto(String nombre, double precio, String tipo) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
