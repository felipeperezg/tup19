package tp4;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		String nombre;
		double saldo, monto;
		long nroCuenta;
		int menu;
		CuentaCorriente[] cuentas=new CuentaCorriente[5];
		CuentaCorriente cuentaTransferencia;
		boolean continuar=false;
		boolean continuarMenu=true;
		char respuesta='S';
		
		//Variables a usar
		
		for (int x=1;x<cuentas.length;x++) {
			cuentas[x]=new CuentaCorriente("Carlos",300);
		}
		//Cargamos el arreglo con algunas cuentas default
		
		System.out.println("Procederemos a crearle una cuenta:");
		System.out.println("Ingrese el nombre del titular: ");
		nombre=sc.nextLine();
		System.out.println("Ingrese el saldo inicial de la cuenta: ");
		saldo=sc.nextDouble();
		
		cuentas[0]= new CuentaCorriente(nombre,saldo);
		
		//Creamos la cuenta con la que operaremos.
		
		do {
		System.out.println("Bienvenido "+nombre+",¿Qué desea realizar?\n1=Depósito\n2=Extracción\n3=Transfererencia\n4=Ver los datos de su cuenta");
		System.out.println("Escriba el número de la opción elegida: ");
		menu=sc.nextInt();

			switch (menu) {
			case 1:
				do {
					System.out.println("Ingrese el monto a utilizar: ");
					monto=sc.nextDouble();
					if (monto<=0) {
						System.out.println("Ingrese un monto válido.");
					}
				}while (monto<=0);
				
				cuentas[0].agregarSaldo(monto);
				
				break;
			case 2:
				do {
					System.out.println("Ingrese el monto a utilizar: ");
					monto=sc.nextDouble();
					if (monto<=0) {
						System.out.println("Ingrese un monto válido.");
					}
				}while (monto<=0);
				
				cuentas[0].extraccionSaldo(monto);
				
				break;
			case 3:
				do {
					System.out.println("Ingrese el monto a utilizar: ");
					monto=sc.nextDouble();
					if (monto<=0) {
						System.out.println("Ingrese un monto válido.");
					}
				}while (monto<=0);
				
				System.out.println("Listado de cuentas a la que puede realizar una transferencia: ");
				for (int x=1;x<cuentas.length;x++) {
					System.out.println(cuentas[x].getNumeroCuenta());
				}
				
				do {
					System.out.println("Ingrese la cuenta a la que realizará la transferencia: ");
					nroCuenta=sc.nextLong();
					for (int x=1;x<cuentas.length;x++) {
						if (nroCuenta==cuentas[x].getNumeroCuenta()) {
							cuentaTransferencia=cuentas[x];
							continuar=true;
							cuentas[0].transferencia(cuentaTransferencia, monto);
							System.out.println('\n'+cuentas[0].getInfo());
							System.out.println('\n'+cuentaTransferencia.getInfo());
							break;
						}
					}
					if (!continuar) {
						System.out.println("El número de cuenta no existe.");
					}
				}while (!continuar);
				
				
				break;
			case 4:	
				System.out.println(cuentas[0].getInfo());
				break;
			default:
				System.out.println("Ingrese un número válido por favor.");
			}
			System.out.println("¿Desea seguir operando? Ingrese N para frenar las operaciones.");
			respuesta=sc.next().charAt(0);
			if (respuesta=='n' || respuesta=='N') {
				continuarMenu=false;
			}
		}while (continuarMenu);
		
		//Repetimos las 4 operaciones hasta que el usuario le ponga un alto.
		
		System.out.println("Fin del programa.");
		
		
	}

}
