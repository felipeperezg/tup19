package clase5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int opcion;
		double operacion;
		char continuar='S';
		long nroCuenta=0;
		int z=0;
		
		System.out.println("Ingrese el nombre para la nueva cuenta.");
		String titular=sc.nextLine();
		System.out.println("Ingrese el saldo inicial de la nueva cuenta.");
		double saldo=sc.nextDouble();
		CuentaCorriente[] nuevaCuenta=new CuentaCorriente[100];
		nuevaCuenta[0]= new CuentaCorriente(titular,saldo);
		nuevaCuenta[1]= new CuentaCorriente("Pedro",3500);
		for (int x=2;x<nuevaCuenta.length;x++) {
			nuevaCuenta[x]= new CuentaCorriente ("sos",300);
		}
		System.out.println("El número de cuenta de Pedro es: "+nuevaCuenta[1].getNroCuenta());
		do {
			System.out.println("¿Que operación desea realizar? 1=Agregar dinero 2=Extraer dinero 3=Obtener saldo 4=Obtener información completa 5=Transferir un dinero de una cuenta a otra.");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el monto que desea agregar.");
				operacion=sc.nextDouble();
				nuevaCuenta[0].setSaldo(operacion);
				break;
			case 2:
				System.out.println("Ingrese el monto que desea retirar.");
				operacion=sc.nextDouble();
				nuevaCuenta[0].extraerSaldo(operacion);
				break;
			case 3:
				System.out.println("Su saldo es de: "+nuevaCuenta[0].getSaldo());
				break;
			case 4:
				System.out.println(nuevaCuenta [0].getInfo());	
				break;
			case 5:
				System.out.println("Ingrese la cuenta destino: ");
				nroCuenta=sc.nextLong();
				for (int x=0;x<nuevaCuenta.length;x++) {
					if (nuevaCuenta[x].getNroCuenta() == nroCuenta) {
						System.out.println("Ingrese el monto a transferir");
						operacion=sc.nextDouble();
						nuevaCuenta[x].setSaldo(nuevaCuenta[0].extraerSaldo(operacion));
						break;
					}
					z=x;
				}
				if (z==nuevaCuenta.length-1) {
					System.out.println("Ese número de cuenta no esiste");
				}
			}
			System.out.println("Desea continuar realizando operaciones? S/N ");
			continuar=sc.next().charAt(0);
		}while (continuar!='N' && continuar!='n');
		System.out.println("Fin del programa.");
		
	}

}
