package Clase6;

public class Jefe extends Empleado {

    private double bonus=1000;

    public Jefe(String nombre, double sueldo){

        super(nombre,sueldo);

    }

    public double getSueldo(){

        return super.getSueldo()+this.bonus;

    }

}
