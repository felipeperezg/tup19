package tp2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int pares=0, acum=0;
		int[] array= new int [10];
		
		System.out.println("Comienzo del programa, introduzca 10 números enteros.");
		for (int x=0;x<10;x++) {
			System.out.println("Ingrese un numero:");
			array[x]=sc.nextInt();
			if (x%2==0) {
				pares++;
				acum+=array[x];
			}
		}
		if (pares>=1) {
			System.out.println("La media de las posiciones pares es de: "+acum/pares);
		}
	}

}
