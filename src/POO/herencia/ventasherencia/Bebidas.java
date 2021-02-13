package POO.herencia.ventasherencia;

public class Bebidas extends Producto {
    private double precio;
    private boolean tieneGas;
    private static int contadorBebidas;

    public Bebidas(String nombre, String categoria) {
        super(nombre, categoria);
        ++Bebidas.contadorBebidas;
    }

    public Bebidas(String nombre, String categoria, double precio, boolean tieneGas) {
        super(nombre, categoria);
        this.precio = precio;
        this.tieneGas = tieneGas;
        ++Bebidas.contadorBebidas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTieneGas() {
        return tieneGas;
    }

    public void setTieneGas(boolean tieneGas) {
        this.tieneGas = tieneGas;
    }

    public static int getContadorBebidas() {
        return contadorBebidas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Precio: " + this.precio
                + "\n¿Con gas?: " + this.tieneGas
                + "\nTotal Productos: " + Producto.contadorProductos
                + "\nTotal Bebidas: " + Bebidas.contadorBebidas
                + "\nTotal Comida: " + Comida.getContadorComida()
                + "\n";

    }
}
