package tp8.ejercicio3;

import java.util.Scanner;

public class Moto implements Vehiculo {
	@Override
	public String verInfo() {
		// TODO Auto-generated method stub
		return ("Moto:\nNombre: "+this.nombre+"\nVelocidad actual: "+this.velocidad_actual);
	}

	float velocidad_actual;
	String nombre;
	
	public Moto(String nombre, float velocidad_actual) {
		this.nombre=nombre;
		if (velocidad_actual > Vehiculo.velocidad_maxima) {
			System.out.println("Demasiado r�pido, se establecer� la velocidad m�xima: " + Vehiculo.velocidad_maxima);
			this.velocidad_actual=Vehiculo.velocidad_maxima;
		}else {
			this.velocidad_actual=velocidad_actual;
		}
	}
	
	
	@Override
	public void acelerar(float velocidad) {
		// TODO Auto-generated method stub
		if ((this.velocidad_actual+velocidad) < Vehiculo.velocidad_maxima) {
			this.velocidad_actual+=velocidad;
		}else {
			System.out.println("Velocidad m�xima alcanzada.");
			this.velocidad_actual=Vehiculo.velocidad_maxima;
		}
		System.out.println("La velocidad actual es de: "+this.velocidad_actual);
	}

	@Override
	public void frenar(float velocidad) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuanta fuerza aplicar� al freno trasero? Sugerido: 3");
		int fuerzaTras=sc.nextInt();
		System.out.println("Cuanta fuerza aplicar� al freno delantero? Sugerido: 3");
		int fuerzaDel=sc.nextInt();
		if (fuerzaTras > 5 && fuerzaDel > 5) {
			System.out.println("La moto fren� demasiado fuerte, se cay� de la moto.");
			return;
		}
		else if (fuerzaTras > 4 && fuerzaDel < fuerzaTras) {
			System.out.println("Aplico demasiada fuerza en el freno trasero, la moto se di� vuelta");
			return;
		}
		else if (fuerzaTras < 4 && fuerzaDel < fuerzaTras) {
			System.out.println("La moto est� haciendo william shakespeare.");
		}
		else if (fuerzaDel > 4 && fuerzaTras < fuerzaDel) {
			System.out.println("Aplico demasiada fuerza en el freno delantero, la moto se di� vuelta");
			return;
		}
		else if (fuerzaDel < 2 && fuerzaTras <2) {
			System.out.println("Aplico muy poca fuerza en los frenos, la moto solo disminuy� un poco la velocidad.");
			velocidad=velocidad/2;
		}
		
		// TODO Auto-generated method stub
		if ((this.velocidad_actual-velocidad) <=0) {
			System.out.println("La moto se detuvo.");
			this.velocidad_actual=0;
		}else {
			this.velocidad_actual-=velocidad;
		}
		System.out.println("La velocidad actual es de: "+this.velocidad_actual);
	}

	@Override
	public int plazas() {
		// TODO Auto-generated method stub
		return 2;
	}

}
