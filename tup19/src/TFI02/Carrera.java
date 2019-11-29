package TFI02;

import java.util.TreeSet;
import java.util.Scanner;

public class Carrera implements Informacion, Comparable<Carrera>{
    public Carrera(String nombre) {
        this.nombre = nombre;;
    }

    @Override
    public String toString() {
        return "Carrera : '" + nombre+"'";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(TreeSet<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    private String nombre;
    private TreeSet<Materia> coleccionMaterias=new TreeSet<Materia>();

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }
    public void eliminarMateria(String materia){
        for (Materia m:coleccionMaterias){
            if (m.nombre.equals(materia)){
                coleccionMaterias.remove(m);
            }
        }
    }
    public String encontrarMateria(String nombre){
        for (Materia m:coleccionMaterias){
            if (m.getNombre().equals(nombre)){
                System.out.println(m.toString());
                System.out.println("Desea eliminar la materia? SI/NO");
                Scanner sc=new Scanner (System.in);
                String respuesta=sc.next();
                if(respuesta.equals("SI")){
                    coleccionMaterias.remove(m);
                    return("La materia se ha eliminado.");
                }else if (respuesta.equals("NO")) {
                    return m.toString();
                }else{
                    return "La respuesta no era una opción, no se ha borrado la materia"+"\n"+m.toString();
                }
            }
        }
        return "No existe la materia en esta carrera";
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        String coleccion="Carrera: "+this.nombre+".\nMaterias: \n";
        for(Materia m:coleccionMaterias){
            coleccion+=m.toString()+"\n";
        }
        return coleccion;
    }
    @Override
    public int compareTo(Carrera o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
