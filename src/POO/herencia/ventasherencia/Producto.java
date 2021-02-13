package POO.herencia.ventasherencia;

public class Producto {
    protected int idProducto;
    protected String nombre;
    protected String categoria;
    protected static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, String categoria) {
        this();
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ID: " + this.idProducto +
                "\nNombre: " + this.nombre +
                "\nCategoria: " + this.categoria
                + "\n";
    }
}
