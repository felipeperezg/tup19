package tp6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Bienvenido, procederemos al creado de sus contraseñas");
		System.out.println("Ingrese la longitud de las contraseñas.");
		int largo=sc.nextInt();
		System.out.println("Ingrese la cantidad de contraseñas.");
		int cantidad=sc.nextInt();
		Contraseñas ola=new Contraseñas (cantidad,largo);
		ola.CrearContraseñas();
		ola.MostrarContraseñas();
	}

}
