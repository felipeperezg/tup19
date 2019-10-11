package tp9.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int natural;
        double primer;
        double segundo;
        String seguirOperando="S";
        String operacion;
        
        
        System.out.println("Ingrese la cantidad de numeros que cargara");
        int cantidad = sc.nextInt();
        Numeros[] array = new Numeros[cantidad];

        for (int x=0;x<array.length;x++){
            System.out.println("Numero "+(x+1)+"\n\n");
            System.out.println("¿Creara un numero natural o un numero complejo? 1=Natural 2=Complejo");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    do {
                        System.out.println("Ingrese el numero.");
                        natural = sc.nextInt();
                        if (natural<0){
                            System.out.println("Los naturales deben ser positivos, ingreselo nuevamente.");
                        }
                    }while (natural < 1);
                    array[x]=new Natural(natural);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    primer=sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    segundo=sc.nextDouble();
                    array[x]=new Complejo(primer,segundo);
                    break;
                default:
                    System.out.println("No ingreso una opcion valida, vuelva a ingresarla.");
                    x--;
                    break;
            }
        }
        do {
            System.out.println("Que desea obtener? 1=Suma de todos los naturales 2=Suma de todos los complejos\n3=Listado de naturales 4=Listado de complejos");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    Operaciones.sumatoriaN(array);
                    break;
                case 2:
                    Operaciones.sumatoriaC(array);
                    break;
                case 3:
                    Operaciones.listarNaturales(array);
                    break;
                case 4:
                    Operaciones.listarComplejos(array);
                    break;
                default:
                    System.out.println("Ingresa bien la proxima");
                    break;
            }
            do {
                System.out.println("Desea seguir operando? SI/NO");
                seguirOperando = sc.next();
                if (!seguirOperando.equals("SI") && !seguirOperando.equals("NO")) {
                    System.out.println("Ingresa bien las opciones");
                }
            }while (!seguirOperando.equals("SI") && !seguirOperando.equals("NO"));
        }while (seguirOperando.equals("SI"));
        System.out.println("¿Quiere realizar alguna operacion entre 2 objetos?\n 1= Suma\n 2=Resta \n 3=Multiplicacion");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Suma de naturales o complejos? NATURALES/COMPLEJOS");
                operacion=sc.next();
                if (operacion.equals("NATURALES")){
                    Operaciones.listarNaturales(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el primero: ");
                    int n1=sc.nextInt();
                    System.out.println("Ingrese el segundo: ");
                    int n2=sc.nextInt();
                    
                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==((double)n1) && array[x].getTipo().equals("natural")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==((double)n2) && array[i].getTipo().equals("natural")) {
                    				((Natural)array[x]).suma(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Almenos un numero no es correcto, no sepudo realizar la suma");
                    }
                    
                }else if (operacion.equals("COMPLEJOS")){
                	Operaciones.listarComplejos(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el valor real del primer complejo: ");
                    double n1=sc.nextInt();
                    System.out.println("Ingrese el valor imaginario del primer complejo: ");
                    double n2=sc.nextDouble();
                    System.out.println("Ingrese el valor real del segundo complejo: ");
                    double n3=sc.nextDouble();
                    System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                    double n4=sc.nextDouble();
                    

                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==n1 && array[x].getValor2()==n2 && array[x].getTipo().equals("complejo")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==n3 && array[i].getValor2()==n4 && array[i].getTipo().equals("complejo")) {
                    				((Complejo)array[x]).suma(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Al menos un numero no es correcto, no se pudo realizar la suma.");
                    }
                }else{
                    System.out.println("Ingresa bien.");
                }
                break;
            case 2:
                System.out.println("Resta de naturales o complejos? NATURALES/COMPLEJOS");
                operacion=sc.next();
                if (operacion.equals("NATURALES")){
                    Operaciones.listarNaturales(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el primero: ");
                    int n1=sc.nextInt();
                    System.out.println("Ingrese el segundo: ");
                    int n2=sc.nextInt();
                    
                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==((double)n1) && array[x].getTipo().equals("natural")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==((double)n2) && array[i].getTipo().equals("natural")) {
                    				((Natural)array[x]).resta(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Almenos un numero no es correcto, no sepudo realizar la resta");
                    }
                    
                }else if (operacion.equals("COMPLEJOS")){
                	Operaciones.listarComplejos(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el valor real del primer complejo: ");
                    double n1=sc.nextInt();
                    System.out.println("Ingrese el valor imaginario del primer complejo: ");
                    double n2=sc.nextDouble();
                    System.out.println("Ingrese el valor real del segundo complejo: ");
                    double n3=sc.nextDouble();
                    System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                    double n4=sc.nextDouble();
                    

                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==n1 && array[x].getValor2()==n2 && array[x].getTipo().equals("complejo")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==n3 && array[i].getValor2()==n4 && array[i].getTipo().equals("complejo")) {
                    				((Complejo)array[x]).resta(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Al menos un numero no es correcto, no se pudo realizar la resta.");
                    }
                }else{
                    System.out.println("Ingresa bien.");
                }
                break;
            case 3:
            	System.out.println("Resta de naturales o complejos? NATURALES/COMPLEJOS");
                operacion=sc.next();
                if (operacion.equals("NATURALES")){
                    Operaciones.listarNaturales(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el primero: ");
                    int n1=sc.nextInt();
                    System.out.println("Ingrese el segundo: ");
                    int n2=sc.nextInt();
                    
                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==((double)n1) && array[x].getTipo().equals("natural")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==((double)n2) && array[i].getTipo().equals("natural")) {
                    				((Natural)array[x]).multiplicacion(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Almenos un numero no es correcto, no sepudo realizar la mult");
                    }
                    
                }else if (operacion.equals("COMPLEJOS")){
                	Operaciones.listarComplejos(array);
                    System.out.println("Entre cuales realizara la suma?");
                    System.out.println("Ingrese el valor real del primer complejo: ");
                    double n1=sc.nextInt();
                    System.out.println("Ingrese el valor imaginario del primer complejo: ");
                    double n2=sc.nextDouble();
                    System.out.println("Ingrese el valor real del segundo complejo: ");
                    double n3=sc.nextDouble();
                    System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                    double n4=sc.nextDouble();
                    

                    boolean check=false;
                    for (int x = 0; x < cantidad; x++) {
                    	if (array[x].getValor1()==n1 && array[x].getValor2()==n2 && array[x].getTipo().equals("complejo")) {
                    		for (int i = 0; i < cantidad; i++) {
                    			if (array[i].getValor1()==n3 && array[i].getValor2()==n4 && array[i].getTipo().equals("complejo")) {
                    				((Complejo)array[x]).multiplicacion(array[i]);
                    				check=true;
                    				break;
                    			}
							}
                    	}
                    }
                    if (!check) {
                    	System.out.println("Al menos un numero no es correcto, no se pudo realizar la mult.");
                    }
                }else{
                    System.out.println("Ingresa bien.");
                }
                break;
        }
    }
}
   