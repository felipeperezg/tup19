package tp8.ejercicio3;

public interface Vehiculo {
	float velocidad_maxima=120;
	void acelerar(float velocidad);
	void frenar(float velocidad);
	int plazas();
	String verInfo();
}
