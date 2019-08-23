package clase5bis;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de cuentas a ingresar: ");
		Scanner sc = new Scanner (System.in);
		int cantCtas = sc.nextInt();
		CuentaCorriente[] cuentas= new CuentaCorriente[cantCtas];
		
		CuentaCorriente.Creacion(cuentas);
		CuentaCorriente.ListarCuentas(cuentas);
		
		System.out.println("Cuenta a buscar: ");
		int nroCuenta= sc.nextInt();
		CuentaCorriente cuentaBuscada= new CuentaCorriente();
		cuentaBuscada=CuentaCorriente.BuscarCuentas(cuentas, nroCuenta);
		
		System.out.println(cuentaBuscada.verInfo());
	}

}
