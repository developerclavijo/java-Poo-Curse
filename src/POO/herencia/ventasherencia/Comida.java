package POO.herencia.ventasherencia;

public class Comida extends Producto {
    private String tipo;
    private static int contadorComida;

    public Comida(String nombre, String categoria, String tipo) {
        super(nombre, categoria);
        this.tipo = tipo;
        ++Comida.contadorComida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getContadorComida() {
        return contadorComida;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Tipo: " + this.tipo
                + "\nTotal Productos: " + Producto.contadorProductos
                + "\nTotal Bebidas: " + Bebidas.getContadorBebidas()
                + "\nTotal Comida: " + Comida.contadorComida
                + "\n";
    }
}
