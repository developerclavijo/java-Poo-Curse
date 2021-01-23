package principal;

public class OperadoresLogicos {
    /*

    Or => ||
    And => &&
    Igualdad == |=> = != ==
    Desigualdad != || !
    Mayor que >
    Menor que <
    Mayor igual que >=
    Menor igual que <=

    */

    /*
    Sumar => +
    Restar => -
    Multiplicar => *
    Dividir => /
    Modulo => %
    */
    public static void main(String[] args) {
        var num1 = 5 * 2 * (5 + 2);
        var num2 = 71;

        var num3 = 50;
        var num4 = 50;

        var bol = num1 == num2 && num3 == num4; //70 == 71 && 50 == 50 => false and true => false
        var bol2 = num1 == num2 || num3 == num4; //70 == 71 || 50 == 50 => false or true => true
        System.out.println("bol = " + bol);
        System.out.println("bol2 = " + bol2);
    }
}
