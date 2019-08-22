package TP3;

import java.util.Arrays;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz=new int [3][3];
		int[] vectorBurbuja= new int [9];
		int z=0;
		
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz.length;y++) {
				matriz[x][y]=(int)(Math.random()*100+1);
			}
		}
		System.out.println("Matriz desordenada:");
		for (int [] fila:matriz) {
			System.out.println(Arrays.toString(fila));
		}
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz.length;y++) {
				vectorBurbuja[z]=matriz[x][y];
				z++;
			}
		}
		Arrays.sort(vectorBurbuja);
		System.out.println("Matriz ordenada:");
		z=0;
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz.length;y++) {
				matriz[x][y]=vectorBurbuja[z];
				z++;
			}
		}
		for (int [] fila:matriz) {
			System.out.println(Arrays.toString(fila));
		}
	}

}
/*Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola. 

Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor*/