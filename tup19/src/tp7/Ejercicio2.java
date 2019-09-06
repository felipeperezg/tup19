package tp7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Ingrese un n�mero del 1 al 100");
		try {
			int numero=sc.nextInt();
			checkNumber(numero);
		}catch (InputMismatchException e) {
			System.out.println("No se ingres� un n�mero");
		}
	}

	
	public static void checkNumber(int numero) throws MalNumero {
		if (numero < 0 || numero > 100) {
			throw new MalNumero("�El n�mero ingresado est� fuera de rango!");
		}else {
			System.out.println("El n�mero ingresado est� dentro de los rangos. �Bien Hecho!");
		}
	}
}

