package tp6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Bienvenido, procederemos al creado de sus contrase�as");
		System.out.println("Ingrese la longitud de las contrase�as.");
		int largo=sc.nextInt();
		System.out.println("Ingrese la cantidad de contrase�as.");
		int cantidad=sc.nextInt();
		Contrase�as ola=new Contrase�as (cantidad,largo);
		ola.CrearContrase�as();
		ola.MostrarContrase�as();
	}

}
