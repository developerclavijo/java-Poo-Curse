package POO.herencia.test;

import POO.herencia.Ingeniero;
import POO.herencia.Persona;

public class TestHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona(621458, "Juan", "Pérez", "Ingeníero de Sistemas");
        System.out.println(persona);

        System.out.println("--------------------");

        Ingeniero ingeniero = new Ingeniero(persona.getIdentidad(), persona.getNombre(), persona.getApellido(), persona.getTrabajo(),
                3000, "Departamento de Sistemas");
        System.out.println(ingeniero);

        System.out.println("-------------------");

        ingeniero.comer();


    }
}
