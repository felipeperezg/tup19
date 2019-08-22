package TP3;

import java.util.Arrays;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= new int [100];
		int x=0;
		do {
			array[x]=(int)(Math.random()*100+1);  //Cargado arreglo
			for (int y=0;y<x;y++) {
				if (array[x]==array[y]) {  //Se encuentra un repetido.
					x--; //El contador vuelve atrás para asignarle uno nuevo.
					break;
				}
			}
			x++;
		}while (x<100);
		for (int item:array) { //Impresión del arreglo con for-each.
			System.out.println(" "+item);
		}
	}

}
/*Crear un array de 100 elementos que guarde en cada una de las posiciones un número
aleatorio entre 1 y 100. El programa debe imprimir en consola todos los valores almacenados
en el array. Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar
el método random() de la clase Math para poder rellenar los elementos del array. 

BONUS: Verificar que el número no se repita.*/