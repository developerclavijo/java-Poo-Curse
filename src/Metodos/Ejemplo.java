package Metodos;


public class Ejemplo {
    public static void main(String[] args) {
        var metodosJava = new MetodosJava();
        var metodosJava2 = new MetodosJava();

        MetodosJava.saludar();
        metodosJava.adios();

        MetodosJava.a = 4;
        System.out.println("----------------");
        System.out.println("a Estatico: " + (MetodosJava.a));

        MetodosJava.a = 6;
        System.out.println("-----------");
        System.out.println("a Estatic 2 : " + (MetodosJava.a));

        System.out.println("-----------------");
        metodosJava.b = 5;
        System.out.println("Primer objeto, metodosJava = " + (metodosJava.b));

        System.out.println("-------------");
        metodosJava2.b = 20;
        System.out.println("Segundo objeto, metodosJava2 = " + (metodosJava2.b));

        System.out.println(MetodosJava.C);

        MetodosJava.saludar();

    }
}
