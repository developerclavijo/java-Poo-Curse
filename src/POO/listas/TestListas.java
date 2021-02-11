package POO.listas;

import java.util.ArrayList;
import java.util.List;

public class TestListas {
    public static void main(String[] args) {
        List nombres = new ArrayList();
        List<Integer> numeros = new ArrayList<>();

        var j = 0;

        nombres.add("Juan");
        nombres.add("Martin");
        nombres.add("María");
        nombres.add("Juana");

        for (Object elemento :
                nombres) {
            System.out.println("elemento = " + j + ": " + elemento);
            j++;
        }

        System.out.println("-------------------");

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Object num :
                numeros) {
            System.out.println("elemento = " + num);
            j++;
        }
    }
}
