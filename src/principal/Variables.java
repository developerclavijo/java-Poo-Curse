package principal;

public class Variables {
    //Var
    /*int n4 = 1819281; //entero
    float n5 = 15151.04F; //flotante
    double n6 = 15456.1818; //Decimal
    boolean tr = true;
    boolean td = false;

    //Cadenas
    String cadena1 = "Hola, soy una cadena";
    char letra1 = 'A';

    long n7 = 1818161919;*/

    //////////////// Java 11 =>
    public static void main(String[] args) {
        /*var n1 = 4; //int
        var n2 = 4.5; //double
        var cad = ""; //String
        var tf = false;

        //Primitivas y no Primitivas

        ///No Primitivos
        String cadena = "Hola Mundo";
        Integer => int
        Double => double
        Float => float
        Char => char

        System.out.println(cadena.toUpperCase());*/

        //var n1 = 5 + "5.5";
        //var resultado = n1;
        //System.out.println("resultado = " + resultado);

        var n = 5;
        var n2 = "5";
        var resultado = n + Integer.parseInt(n2);

        System.out.println("resultado = " + resultado);

        //var ng = 4;
        //String ng2 = "6";


        System.out.println("Hola, estoy aprendiendo Java 15: ");

        var j = "";
        //String jh, nombre, nom;
        var nombreCompleto = ""; //para variables
        String nombre = "Juan";

        //Clases en Java => ParaValidar:
        System.out.println("nombre = " + nombre.replace('a', 'e'));

    }

}