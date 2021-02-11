package POO.ventas.test;

import POO.ventas.Boleta;
import POO.ventas.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Producto producto = new Producto("Arroz", 2.80, "Comestible");
        Producto producto2 = new Producto("Azucar", 2.50, "Comestible");

        Boleta boleta = new Boleta();

        boleta.agregarProductos(producto);
        boleta.agregarProductos(producto2);

        boleta.mostrarProductos();
    }
}
