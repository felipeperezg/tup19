package tp4;

public class CuentaCorriente {

	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		this.numeroCuenta=(long)(Math.random()*1000+1);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getInfo() {
		return "Nombre: "+this.nombreTitular+"\nN�mero de cuenta: "+this.numeroCuenta+"\nSaldo: "+this.saldo;
	}
	
	public void agregarSaldo(double saldo) {
		if(saldo==-10) {
			System.out.println("No se pudo completar la transferencia");
			return;
		}
		this.saldo+=saldo;
		System.out.println("El dep�sito se efectu� correctamente");
	}
	
	public long getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	
	public double extraccionSaldo(double saldo) {
		if (this.saldo-saldo >=0) {
			this.saldo-=saldo;
			System.out.println("La extracci�n se realiz� satisfactoriamente");
			return saldo;
		}
		System.out.println("No hay saldo suficiente para realizar la extracci�n");
		return -10;
	}
	
	public void transferencia(CuentaCorriente cuenta,double saldo) {
		cuenta.agregarSaldo(this.extraccionSaldo(saldo));
	}
	
}
