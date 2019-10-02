package tp8.ejercicio3;
import java.util.Scanner;
public class Menues {

	public static void Menu() {
		Scanner sc= new Scanner (System.in);
		String respuesta;
		System.out.println("Bienvenido. Con cuantos vehiculos va a operar?");
		int cantVe=sc.nextInt();
		
		Vehiculo[] vehiculos=new Vehiculo[cantVe];
		int vehicActual=0;
		do {
			System.out.println("Que desea realizar? 1= Listar coches y motos 2= Crear un coche o una moto.");
			int opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				if (vehicActual==0) {
					System.out.println("Aún no ha creado vehículos, creelos e intentelo nuevamente.");
					break;
				}
				for (int x=0; x < vehicActual; x++) {
					System.out.println(vehiculos[x].verInfo());
				}
				break;
			case 2:
				if (vehicActual==cantVe) {
					System.out.println("Ya no se pueden crear más vehiculos.");
					break;
				}
				System.out.println("Que desea crear? AUTO/MOTO");
				String creacion=sc.next();
				if (creacion.equals("AUTO")) {
					vehiculos[vehicActual]=CrearCoche();
					vehicActual++;
				}else if (creacion.equals("MOTO")){
					vehiculos[vehicActual]=CrearMoto();
					vehicActual++;
				}else {
					System.out.println("No ingresó una opción válida, recuerde respetar mayus y minus.");
				}
				break;
			default:
				System.out.println("No ingresó una opción válida.");
			}
			do {
				System.out.println("Desea seguir operando? SI/NO");
				respuesta=sc.next();
				if (!respuesta.equals("SI") && !respuesta.equals("NO")) {
					System.out.println("Ingresá bien.");
				}
			}while (!respuesta.equals("SI") && !respuesta.equals("NO"));
		}while (respuesta.equals("SI"));
			System.out.println("Desea usar un vehículo? SI/NO");
			respuesta=sc.next();
			if (!respuesta.equals("SI") && !respuesta.equals("NO")) {
				System.out.println("Ingresá bien.");
			}
			if (respuesta.equals("SI")) {
				Vehiculo otorgado = vehiculos[(int)Math.random()*vehicActual];
				System.out.println("Se le ha otorgado un vehículo.");
				System.out.println(otorgado.verInfo());
				System.out.println("Ingrese una velocidad para acelerar: ");
				int aceleracion=sc.nextInt();
				otorgado.acelerar(aceleracion);
				System.out.println("Ingrese una velocidad para frenar: ");
				int frenado=sc.nextInt();
				otorgado.frenar(frenado);
				System.out.println("La cantidad de plazas de su vehículo es de: "+otorgado.plazas());
			}
		
	}
	
	public static Coche CrearCoche() {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Ingrese el nombre para el coche: ");
		String nombreC=sc.next();
		
		System.out.println("Ingrese la velocidad actual del coche: ");
		float velAcC=sc.nextFloat();
		
		Coche auto = new Coche(nombreC,velAcC);
		return auto;
	}
	
	public static Moto CrearMoto() {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Ingrese el nombre para la moto: ");
		String nombreM=sc.next();
		
		System.out.println("Ingrese la velocidad actual de la moto: ");
		float velAcM=sc.nextFloat();
		
		Moto moto = new Moto(nombreM,velAcM);
		return moto;
	}
}
	
