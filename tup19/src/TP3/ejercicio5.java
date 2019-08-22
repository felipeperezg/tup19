package TP3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int[][] matriz=new int [3][3];
		int[] vectorBurbuja= new int [9];
		int z=1;
		
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz.length;y++) {
				System.out.print("Ingrese el número de la posición "+z+": ");
				matriz[x][y]=sc.nextInt();
				z++;
			}
		}
		System.out.println("Matriz desordenada:");
		for (int [] fila:matriz) {
			System.out.println(Arrays.toString(fila));
		}
		z=0;
		for (int x=0;x<matriz.length;x++) {
			for (int y=0;y<matriz.length;y++) {
				vectorBurbuja[z]=matriz[x][y];
				z++;
			}
		}
		Arrays.sort(vectorBurbuja);
		System.out.println("Matriz ordenada:");
		z=0;
		for (int x=matriz.length-1;x>=0;x--) {
			for (int y=matriz.length-1;y>=0;y--) {
				matriz[x][y]=vectorBurbuja[z];
				z++;
			}
		}
		for (int [] fila:matriz) {
			System.out.println(Arrays.toString(fila));
		}
	}

}
/*Realice un programa que genere una matriz de 3x3 con números ingresados por el usuario por medio de la consola. 

Una vez terminada la carga de los elementos se debe mostrar primero la matriz cargada con los datos iniciales y 
luego la matriz con los datos ordenados de mayor a menor.*/
