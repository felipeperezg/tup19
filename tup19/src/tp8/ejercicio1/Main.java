package tp8.ejercicio1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo[] vehiculos = new Vehiculo[2];
		System.out.println("Creación de coche: Ferrari, velocidad inicial de 60.");
		vehiculos[0]=new Coche("Ferrari", 60);
		
		System.out.println("Creación de moto: Motomel, velocidad inicial de 50.");
		vehiculos[1]=new Moto("Motomel", 50);
	
		System.out.println("Acelerado del coche en 30.");
		vehiculos[0].acelerar(30);
		System.out.println("Frenado del coche en 60.");
		vehiculos[0].frenar(60);
		
		System.out.println("La cantidad de plazas del coche es de: "+vehiculos[0].plazas());
		System.out.println("Acelerado de la moto en 300.");
		vehiculos[1].acelerar(300);
		System.out.println("Frenado de la moto en 120.");
		vehiculos[1].frenar(120);
		
		System.out.println("La cantidad de plazas de la moto es de: "+vehiculos[1].plazas());
		
	}

}
