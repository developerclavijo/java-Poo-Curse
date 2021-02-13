package POO.herencia.ventasherencia;

import java.util.Arrays;

public class Factura {
    private int idFactura;
    private Producto[] productos;
    private Bebidas[] bebidas;
    private Comida[] comidas;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    private static int contador;

    public Factura() {
        this.idFactura = ++Factura.contador;
        this.productos = new Producto[Factura.MAX_PRODUCTOS];
        this.bebidas = new Bebidas[Factura.MAX_PRODUCTOS];
        this.comidas = new Comida[Factura.MAX_PRODUCTOS];
    }

    public void agregar(Producto producto) {
        if (this.contadorProductos < 10) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Has alcanzado el maximo de productos: " + Factura.MAX_PRODUCTOS);
        }
    }

    public void mostrarProductos() {
        for (var i = 0; i < contadorProductos; i++)
            System.out.println(productos[i]);
    }

    @Override
    public String toString() {
        return "Venta Hecha" +
                "\n------------" +
                "\nProductos agregados:" +
                "\n" +
                Arrays.toString(productos)
                + "\n" +
                Arrays.toString(bebidas)
                + "\n"
                + Arrays.toString(comidas)
                + "\nProductos totales: " + this.contadorProductos;
    }

}
