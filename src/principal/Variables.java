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

    //
    /**/

    /**
     * @param args
     * @autor Clavijo
     * @date 22-01-2021
     */
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
        //var n2 = "5";
        //var resultado = n + Integer.parseInt(n2);

        //System.out.println("resultado = " + resultado);

        //var ng = 4;
        //String ng2 = "6";


        System.out.println("Hola, estoy aprendiendo Java 15: ");

        var j = "";
        //String jh, nombre, nom;
        var nombreCompleto = ""; //para variables
        String nombre = "Juan";

        //Clases en Java => ParaValidar:
        System.out.println("nombre = " + nombre.replace('a', 'e'));

        //variables numericas
        int n1 = 1566999999;
        byte n2 = 127;
        short n3 = 9999;
        long n4 = 999999999;

        float n5 = 15.5F;
        double n6 = 15.5;

        //variables de texto
        String cadena1 = "Hola ¿que tal?";
        char caracter = 'B';

        //variables de dos valores
        boolean boleano = true;
        boolean boleano2 = false;

        ///////////// JDK 11 =>
        var n7 = 12;
        var n8 = 12.5;
        var cadena3 = "Hola a todos";
        var caracter1 = 'A';
        var boleano3 = true;
        boleano3 = false;
        boleano3 = true;

        n8 = 14.6F;

        n7 = n7 + 1;
        n8 = n8 - 1;

        n7++;
        n8--;
        System.out.println("Números: " + "n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3 + " n4 = " + n4 + " n5 = " + n5
                + " n6 = " + n6 + " n7 " + n7 + " n8 " + n8
                + "\nCadenas: " + " cadena1 = " + cadena1 + " cadena3" + cadena3 +
                "\nCaracteres: " + caracter + " caracter1 = " + caracter1
                + "\nboleanos: " + " boleano = " + boleano + " boleano2 = " + boleano2 + " boleano3 = " + boleano3);
    }

}