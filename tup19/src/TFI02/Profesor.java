package TFI02;

public class Profesor extends Persona{
    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre="+super.getNombre()+", apellido="+super.getApellido()+", legajo="+super.getLegajo()+", basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }

    double basico;
    int antiguedad;

    public double calcularSueldo(){
        return ((10*basico)/100)*antiguedad+basico;
    }
    @Override
    public void modificarDatos() {
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
//Sueldo : 10 por el basico divido cien, multiplicado por la cantidad de años + basico

}

