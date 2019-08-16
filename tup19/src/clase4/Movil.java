package clase4;

public class Movil {
	
	private int dimenPantalla;
	private int Capacidad;
	private double Precio;
	private int Camara;
	private String tipo;
	
	
	public Movil(int dimenPantalla,int Capacidad, double Precio, int Camara, String tipo) {
		
		this.dimenPantalla = dimenPantalla;
		this.Capacidad=Capacidad;
		this.Camara=Camara;
		this.tipo=tipo;
		this.Precio=Precio;
	}
	
	public String verInfo() {
		return "La dimensión de su pantalla es de: "+this.dimenPantalla+
				" pulgadas, la capacidad de su dispositivo es de: "+this.Capacidad+
				" GB, el precio de su dispositivo es de $"+this.Precio+
				", El tipo de su dispositivo movil es: "+ this.tipo+".";
	}
	
	
	
	
}
