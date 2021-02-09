package POO.test;

import POO.ClasesYObjetos.Carro;

public class TestCarro {
    public static void main(String[] args) {
        var carro = new Carro();
        System.out.println("carro = " + carro.getId());

        var carro2 = new Carro();
        System.out.println("carro = " + carro2.getId());

        var carro3 = new Carro();
        System.out.println("carro = " + carro3.getId());

        System.out.println("--------------");
        System.out.println(carro3);

        carro3.setMarca("Ferrari");
        carro3.setTipo("Deportivo");
        carro3.setPrecio(100000);

        System.out.println("--------------");
        System.out.println(carro3);

        System.out.println("--------------");
        var carro4 = new Carro("Lamborgini", 50000, "Deportivo");
        System.out.println(carro4);

        System.out.println("-------- con getters ------");
        carro4.setPrecio(6584001);
        System.out.println("ID: " + carro4.getId()
                + "\nMarca: " + carro4.getMarca()
                + "\nPrecio: " + carro4.getPrecio()
                + "\nTipo: " + carro4.getTipo());

        System.out.println("-------- con toString ------");
        System.out.println(carro4);
    }
}
