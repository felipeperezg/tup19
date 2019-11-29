package TFI02;

import java.util.TreeSet;

public class Materia  implements Informacion, Comparable<Materia> {
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public TreeSet<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(TreeSet<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    String nombre;
    Profesor titular;
    TreeSet<Estudiante> coleccionEstudiantes=new TreeSet<Estudiante>();

    @Override
    public String toString() {
        return "Materia: '" + nombre +
                "', titular: " + titular.getNombre();
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        String coleccion="Materia '"+this.nombre+ "'\nEstudiantes: \n";
        for(Estudiante estudiante:coleccionEstudiantes){
            coleccion+=estudiante.toString()+"\n";
        }
        return coleccion;
    }

    public void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }
    public void eliminarEstudiante(String nombre){

        for (Estudiante estudiante:coleccionEstudiantes){
            if (estudiante.getNombre().equals(nombre)){
                coleccionEstudiantes.remove(estudiante);
            }
        }
    }
    public void modificarTitular(Profesor profesor){
        this.titular=profesor;
    }

    @Override
    public int compareTo(Materia o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
