package tp8.ejercicio2;

public interface Vehiculo {
	float velocidad_maxima=120;
	void acelerar(float velocidad);
	void frenar(float velocidad);
	int plazas();
	String verInfo();
}
