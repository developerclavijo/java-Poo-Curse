package POO.herencia.ventasherencia.test;

import POO.herencia.ventasherencia.Bebidas;
import POO.herencia.ventasherencia.Comida;
import POO.herencia.ventasherencia.Factura;
import POO.herencia.ventasherencia.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Factura factura = new Factura();
        Producto producto1 = new Producto("Papitas Lays", "Chatarra");
        Producto producto2 = new Producto("Chisito", "Chatarra");

        Bebidas bebida1 = new Bebidas("Agua Mineral", "Agua", 1.50, false);

        Comida comida1 = new Comida("Ceviche", "Picantes", "Comida gastronomica");

        factura.agregar(producto1);
        factura.agregar(producto2);

        factura.agregar(bebida1);

        factura.agregar(comida1);

        factura.mostrarProductos();

        System.out.println("-----------");

        System.out.println(factura);
    }
}
