package tp2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ceros=0, positivos=0, negativos=0;
		int[] array= new int [10];
		
		System.out.println("Comienzo del programa, introduzca 10 números enteros.");
		for (int x=0;x<10;x++) {
			System.out.println("Ingrese la posición "+(x+1));
			array[x]=sc.nextInt();
			if (array[x]<0) {
				negativos++;
			}else if (array[x]>0){
				positivos++;
			}else {
				ceros++;
			}
		}
		System.out.println();
		System.out.println("La cantidad de valores 0 es de: "+ceros);
		System.out.println("La cantidad de valores positivos es de: "+positivos);
		System.out.println("La cantidad de valores negativos es de: "+negativos);
	}

}
