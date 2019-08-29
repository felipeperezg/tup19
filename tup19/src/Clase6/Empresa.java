package Clase6;

public class Empresa {

    public static void main(String[] args) {

        Empleado[] Empleados = new Empleado[5];
        Empleados[0]=new Empleado("Juan",40000);
        Empleados[1]=new Empleado("Matis",40000);
        Empleados[2]=new Empleado("Anabela",40000);
        Empleados[3]=new Empleado("Graciela",40000);

        Empleados[4]=new Jefe("Yamil", 40500);

        for(Empleado empleado:Empleados){
            System.out.println(empleado.getDatos()+"\nSueldo: "+empleado.getSueldo());
        }

    }
}
