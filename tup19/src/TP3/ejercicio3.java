package TP3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese la cantidad de personas que ingresará");
		int p=sc.nextInt();
		String[][] personas = new String[3][p];
		String reserva;
		
		for (int x=0;x<personas[0].length;x++) {
			System.out.println("Ingrese el nombre de la persona "+(x+1));
			personas[0][x]=sc.next();
			System.out.println("Ingrese el DNI de la persona "+(x+1));
			personas[1][x]=sc.next();
			System.out.println("Ingrese la edad de la persona "+(x+1));
			personas[2][x]=sc.next();
			System.out.println("");
		}
		for (int x=0;x<(personas[0].length)-1;x++) {
			if (personas[0][x].compareTo(personas[0][x+1]) > 0 ) {
				for (int y=0;y<personas.length;y++) {
				reserva=personas[y][x];
				personas[y][x]=personas[y][x+1];
				personas[y][x+1]=reserva;
				}
			}	
		}	
		for (String[] array: personas) {
			for (String elemento: array) {
				System.out.print(elemento+"\t");
			}
			System.out.println("");
		}

	}
}
/*Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas. 
Los datos para rellenar la matriz deben ser proporcionados por el usuario. 

Una vez que se llene todo el arreglo de arreglos se debe mostrar la información en la consola de una forma clara.

BONUS: ordenar alfabéticamente el arreglo.
*/