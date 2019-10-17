package TFI01;

public class Empleados extends Personas {

    double sueldo;

    public Empleados(String nombre, int edad) {
        super.nombre = nombre;
        super.edad = edad;
    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "Empleado: "+nombre+"\nEdad: "+edad+"\nSueldo: "+sueldo;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
}
