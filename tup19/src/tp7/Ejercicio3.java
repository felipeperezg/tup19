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
			System.out.println("Ingrese un n�mero, el programa le comunicar� si es par o impar");
			try {
				numero=Integer.parseInt(sc.next());
				if (numero % 2 == 0) {
					System.out.println("�El n�mero ingresado es par!");
				}else {
					System.out.println("�El n�mero ingresado es impar!");
				}	
			}
			catch (Exception e) {
				System.out.println("�Espera amiguito! �El valor que ingresaste no es num�rico!");
				control = 1;
			}
		}while (control == 1);
	}

}
