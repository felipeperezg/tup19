package tp7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int numero, control = 0;
		do {
			control = 0;
			System.out.println("Ingrese un número, el programa le comunicará si es par o impar");
			try {
				numero=Integer.parseInt(sc.next());
				if (numero % 2 == 0) {
					System.out.println("¡El número ingresado es par!");
				}else {
					System.out.println("¡El número ingresado es impar!");
				}	
			}
			catch (Exception e) {
				System.out.println("¡Espera amiguito! ¡El valor que ingresaste no es numérico!");
				control = 1;
			}
		}while (control == 1);
	}

}
