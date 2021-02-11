package POO.arreglos;

public class TestArreglosBidi {
    public static void main(String[] args) {
        int[][] numeros = new int[3][2];
        numeros[0][0] = 1;
        numeros[0][1] = 2;

        numeros[1][0] = 3;
        numeros[1][1] = 4;

        numeros[2][0] = 5;
        numeros[2][1] = 6;

        for (var i = 0; i < numeros.length; i++) {
            for (var j = 0; j < numeros[i].length; j++) {
                System.out.println("Filas: " + i + " Columnas: " + j + ": " + numeros[i][j]);
            }
        }
    }
}
