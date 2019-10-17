package TFI01;

public class Acomodadores extends Empleados implements ParaAcomododadores {
    Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public String toString() {
        return "Acomodador " +nombre+"\nEdad "+edad+"\nSueldo "+sueldo+"\nSala asignada: "+sala.getNombre();
    }

    @Override
    public void setSala(Salas sala) {
        this.sala=sala;
    }

    @Override
    public Salas getSala() {
        return sala;
    }
}
