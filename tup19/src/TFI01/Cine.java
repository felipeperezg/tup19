package TFI01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Cine {

    public static void main(String[] args) {

        int cantidadEspect;

        System.out.println("Inicio del programa, cree espectadores:");
        System.out.println("Cuantos espectadores creará?");
        try{
            Scanner sc=new Scanner (System.in);
            cantidadEspect=sc.nextInt();
            Espectadores[] arrayEspect= new Espectadores[cantidadEspect];
            for (int i = 0; i < cantidadEspect; i++) {

                System.out.println("\nIngrese el nombre del espectador "+(i+1));
                String nomEspect;
                nomEspect=sc.next();

                System.out.println("Ingrese la edad del espectador "+(i+1));
                int edadEspect;
                edadEspect=sc.nextInt();

                System.out.println("Ingrese la fila del espectador "+(i+1));
                String filaEspect;
                filaEspect=sc.next();

                System.out.println("Ingrese el número de silla del espectador "+(i+1));
                int sillaEspect;
                sillaEspect=sc.nextInt();
                arrayEspect[i]=new Espectadores(nomEspect,filaEspect,sillaEspect,edadEspect);
            }

            Salas sala1= new Salas(3,"Sala 01");
            sala1.setPelicula("Joker");

            sala1.setEspectadores(arrayEspect);
            System.out.println("\nLos espectadores de la "+sala1.getNombre()+" son: ");
            try{
                for (int i = 0; i <(sala1.getEspectadores().length) ; i++) {
                    Espectadores[] espectadoresDeSala= sala1.getEspectadores();
                    System.out.println(espectadoresDeSala[i].toString());
                }
            }catch (Exception e){
                System.out.println("\nSIN EXPECTADORES CARGADOS.");
            }
            Acomodadores acomodador1= new Acomodadores("Carlos",40);
            System.out.println("\nA la sala se le asignará el acomodador "+acomodador1.getNombre()+".");
            acomodador1.setSala(sala1);
            acomodador1.setSueldo(4000);
            System.out.println(acomodador1.toString());

            System.out.println("\nProcederemos a crear un empleado. ");
            String nomEmpl;
            int edadEmpl;
            System.out.println("Ingrese el nombre del empleado: ");
            nomEmpl=sc.next();
            System.out.println("Ingrese la edad del empleado: ");
            edadEmpl=sc.nextInt();

            Empleados empleado1=new Empleados(nomEmpl,edadEmpl);

            System.out.println("Asignele un sueldo al empleado: ");
            double sueldoEmpl;
            sueldoEmpl=sc.nextDouble();
            empleado1.setSueldo(sueldoEmpl);

            System.out.println("\n"+empleado1.toString());


        }catch (InputMismatchException e){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        }


    }
}
