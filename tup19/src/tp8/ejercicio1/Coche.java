package tp8.ejercicio1;

public class Coche implements Vehiculo {
	float velocidad_actual;
	String nombre;

	public Coche(String nombre, float velocidad_actual) {
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
		if ((this.velocidad_actual+velocidad) <Vehiculo.velocidad_maxima) {
			this.velocidad_actual+=velocidad;
		}else {
			System.out.println("Velocidad m�xima alcanzada.");
			this.velocidad_actual=Vehiculo.velocidad_maxima;
		}
		System.out.println("La velocidad actual es de: "+this.velocidad_actual);
	}

	@Override
	public void frenar(float velocidad) {
		// TODO Auto-generated method stub
		if ((this.velocidad_actual-velocidad) <=0) {
			System.out.println("El coche se detuvo.");
			this.velocidad_actual=0;
		}else {
			this.velocidad_actual-=velocidad;
		}
		System.out.println("La velocidad actual es de: "+this.velocidad_actual);
	}

	@Override
	public int plazas() {
		// TODO Auto-generated method stub
		return 5;
	}
}
