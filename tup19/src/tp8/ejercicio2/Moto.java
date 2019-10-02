package tp8.ejercicio2;

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
			System.out.println("Demasiado rápido, se establecerá la velocidad máxima: " + Vehiculo.velocidad_maxima);
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
			System.out.println("Velocidad máxima alcanzada.");
			this.velocidad_actual=Vehiculo.velocidad_maxima;
		}
		System.out.println("La velocidad actual es de: "+this.velocidad_actual);
	}

	@Override
	public void frenar(float velocidad) {
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
