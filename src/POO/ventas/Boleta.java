package POO.ventas;

import java.util.Arrays;

public class Boleta {
    private Producto[] productos;
    private int id;
    private static int contador;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Boleta() {
        this.id = ++Boleta.contador;
        this.productos = new Producto[Boleta.MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto) {
        this.productos[this.contadorProductos++] = producto;
    }

    public void mostrarProductos() {
        for (var i = 0; i < contadorProductos; i++) {
            System.out.println("Productos: " + productos[i]);
        }
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "productos=" + Arrays.toString(productos) +
                ", id=" + id +
                ", contadorProductos=" + contadorProductos +
                '}';
    }
}
