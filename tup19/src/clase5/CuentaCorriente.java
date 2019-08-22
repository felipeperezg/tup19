package clase5;

public class CuentaCorriente {

	private String titular;
	private double saldo=0;
	private long nroCuenta;
	
	CuentaCorriente(String titular, double saldo){
		this.saldo=saldo;
		this.titular=titular;
		this.nroCuenta=(long)(Math.random()*10000+0);
	}
	public void setSaldo(double saldo){
		this.saldo+=saldo;
		System.out.println("Se incrementó su saldo. Su nuevo saldo es de: "+this.saldo);
	}
	public double getSaldo() {
		return this.saldo;
	}
	public long getNroCuenta() {
		return this.nroCuenta;
	}
	public String getTitular() {
		return this.titular;
	}
	public String getInfo() {
		return ("Nombre de titular: "+this.titular+"\nSaldo: "+this.saldo+"\nNúmero de cuenta: "+this.nroCuenta);
	}
	public void transferirSaldo(double saldo){
		this.saldo+=saldo;
		if (saldo==0) {
			System.out.println("No se pudo completar la transferencia.");
			return;
		}
		System.out.println("La transferencia se realizó satisfactoriamente.");
	}
	public double extraerSaldo(double saldo) {
		if (this.saldo-saldo>=0) {
			this.saldo-=saldo;
			System.out.println("Se retiró dinero de su saldo. Su nuevo saldo es de: "+this.saldo);
		}
		else {
			System.out.println("No hay saldo suficiente para realizar la extracción.");
			return 0;
		}
		return saldo;
	}
}
