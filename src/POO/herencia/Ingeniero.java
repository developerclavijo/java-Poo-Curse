package POO.herencia;

public class Ingeniero extends Persona {
    private double sueldo;
    private String lugarTraba;

    public Ingeniero() {
        super();
    }

    public Ingeniero(int identidad, String nombre, String apellido, String trabajo, double sueldo, String lugarTraba) {
        super(identidad, nombre, apellido, trabajo);
        this.sueldo = sueldo;
        this.lugarTraba = lugarTraba;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getLugarTraba() {
        return lugarTraba;
    }

    public void setLugarTraba(String lugarTraba) {
        this.lugarTraba = lugarTraba;
    }

    @Override
    public void comer() {
        System.out.println("El ingeniero come");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSueldo: " + this.sueldo
                + "\nLugar donde Trabaja: " + this.lugarTraba;
    }
}
