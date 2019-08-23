package clase5bis;

import java.util.Scanner;

public class CuentaCorriente {
	
	private String titular;
	private double saldo=0;
	private long nroCuenta;
	
	public CuentaCorriente(String titular, double saldo, int nroCuenta){
		this.saldo=saldo;
		this.titular=titular;
		this.nroCuenta=nroCuenta;
		
	}
	public CuentaCorriente() {
	}
	
	public void deposito(double monto) {
		this.saldo+=monto;
	}
	public void extraccion(double monto) {
		this.saldo-=monto;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String verInfo() {
		return ("Su nombre es: "+this.titular+".\nTiene un saldo de $"+this.saldo+".\nSu número de cuenta es: "+this.nroCuenta+".");
	}
	
	public static void Transferencia(CuentaCorriente origen, CuentaCorriente destino, int monto) {
		origen.extraccion(monto);
		destino.deposito(monto);
	}
	
	public static void Creacion(CuentaCorriente[] cuentas) {
		Scanner sc=new Scanner (System.in);
		for (int i=0;i<cuentas.length;i++) {
			System.out.print("Nombre: ");
			String nombre=sc.next();
			System.out.print("\nSaldo inicial: ");
			double saldo=sc.nextDouble();
			System.out.print("\nNumero de cuenta ");
			int nroCuenta=sc.nextInt();
			CuentaCorriente cuenta= new CuentaCorriente(nombre,saldo,nroCuenta);
			cuentas[i]=cuenta;
		}
	}
	
	public static void ListarCuentas(CuentaCorriente[] cuentas) {
		for (CuentaCorriente cuenta:cuentas) {
			System.out.println("Nombre: "+ cuenta.titular);
			System.out.println("Saldo: "+ cuenta.saldo);
			System.out.println("Numero de cuenta: "+ cuenta.nroCuenta);
		}
	}
	public static CuentaCorriente BuscarCuentas(CuentaCorriente[] cuentas, int nroCuenta) {
		CuentaCorriente ctaSalida = new CuentaCorriente();
		for (CuentaCorriente cuenta:cuentas) {
			if (nroCuenta==cuenta.nroCuenta) {
				ctaSalida=cuenta;
				break;
			}
		}
		return ctaSalida;
	}
	
	
}
