package TFI02;

import java.util.*;


public class Facultad implements Informacion{
    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(TreeSet<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    private String nombre;
    private TreeSet<Carrera> coleccionCarreras=new TreeSet<Carrera>();

    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(Carrera carrera){
        coleccionCarreras.remove(carrera);
    }

    public void eliminarEstudiante(Estudiante estudiante){
        for (Carrera carrera:coleccionCarreras){
            for(Materia materia:carrera.getColeccionMaterias()){
                for (Estudiante est:materia.coleccionEstudiantes){
                    if (est.equals(estudiante)){
                        materia.eliminarEstudiante(est.getNombre());
                    }
                }
            }
        }
    }


    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        String coleccion="Facultad "+this.nombre+"\nCarreras: \n";
        for(Carrera carrera:coleccionCarreras){
            coleccion+=carrera.toString()+"\n";
        }
        return coleccion;
    }

}
