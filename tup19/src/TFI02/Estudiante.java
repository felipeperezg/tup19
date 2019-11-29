package TFI02;

public class Estudiante extends Persona implements Comparable<Estudiante>{
    public Estudiante(String nombre, String apellido,int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void modificarDatos() {

    }
    @Override
    public String toString() {
        return "Estudiante '"+super.getNombre()+" "+super.getApellido()+"', legajo="+super.getLegajo();
    }

    @Override
    public int compareTo(Estudiante o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
