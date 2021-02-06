package Metodos;

public class MetodosJava {
    static int a;
    int b;
    static final int C = 8;
    static final String NOMBRE = "Juan";

    public static void main(String[] args) {
        //Una funcion o metodo >= es aquel que hace algo en una determinada parte del código
        System.out.println("Hola");
        saludar();
        sumar(4, 4);

        System.out.println("¿Cómo estás?");
        saludar();
        restar(6, 4);

        multiplicar(6, 5);

        dividir(4, 6);

        /*
            ¿Qué son los modificadores de acceso?
            public => publico o sea, que puede ser accedido por todos los paquetes de la aplicacion
            private => privado o sea, que solo puede ser accedido por la clase
            protected => protegido osea, que se usa cuando se hace herencia
            package => paquete o sea, que solo las clases que pertenecen a este paquete,
            pueden acceder a los metodos, o variables de esta clase
            static => estatico, o sea, que para poder acceder a los metodos estaticos de la clase
            no se debe crear el objeto, por que los metodos le pertenecen a la clase y no al objeto
            final = constantes, o sea, que su valor no puede cambiar
            Sobre carga de métodos => es sobre escribir o volver a utilizar el nombre el metodo
            para que haga una función diferente
         */

        System.out.println("--------------");
        var resultado = muliplicarYDividir(8, 4, 2);
        System.out.println(muliplicarYDividir(8, 4, 2));

        System.out.println("------------------");
        System.out.println("resultado = " + resultado);

        System.out.println("-----------");
        System.out.println(nombreCompleto());
        System.out.println(nombreCompleto("Juan", "Pérez"));
        System.out.println(nombreCompleto("Juan", "Pérez", 20));
    }

    static void saludar() {
        System.out.println("Hola Mundo");
    }

    private static void sumar(double a, double b) { //Lo que recibe un metodo
        System.out.println("La suma es: " + (a + b));
    }

    protected static void restar(int a, int b) {
        System.out.println("La resta es: " + (a - b));
    }

    public static void multiplicar(int a, int b) {
        System.out.println("La multiplicación es: " + (a * b));
    }

    public static void dividir(int a, int b) {
        System.out.println("La división es: " + (a / b));
    }

    public void adios() {
        System.out.println("Hasta Luego");
    }

    public static double muliplicarYDividir(double a, double b, double c) {
        return a * b / c;
    }

    public static String nombreCompleto() {
        return "Juan Magna";
    }

    public static String nombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static String nombreCompleto(String nombre, String apellido, int edad) {
        return nombre + " " + apellido + " " + edad;
    }

}
