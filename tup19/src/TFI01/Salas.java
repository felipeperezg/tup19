package TFI01;

import java.util.Arrays;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad=capacidad;
        this.nombre=nombre;
    }


    public void setPelicula(String pelicula) {

        this.pelicula = pelicula;
    }

    public Espectadores[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        if (espectadores.length > capacidad){
            System.out.println("\nExcede la capacidad de la sala, la capacidad de la sala es de: "+capacidad+"\nIntento ingresar "+espectadores.length+" espectadores");
            return;
        }
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        if (this.getEspectadores().equals(null)){
            return "Sala: '"+this.nombre+"', capacidad: "+this.capacidad+"\nEspectadores:\n"+"SIN ESPECTADORES"+"\nPelícula: "+this.pelicula;
        }
        return "Sala: '"+this.nombre+"', capacidad: "+this.capacidad+"\nEspectadores:\n"+Arrays.toString(espectadores)+"\nPelícula: "+this.pelicula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getNombre() {
        return nombre;
    }
}
