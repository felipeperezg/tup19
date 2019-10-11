package tp9.ejercicio1;

public class Operaciones {

    public static void sumatoriaN(Numeros[] array){

        int sumaNaturales=0;

        for (int x=0; x < array.length; x++){
            if (array[x].getTipo().equals("natural")){
                sumaNaturales+=array[x].getValor1();
            }
        }
        System.out.println("La suma de todos los numeros naturales es de: "+sumaNaturales);
    }
    public static void sumatoriaC(Numeros[] array){
        float sumaComplejos1=0, sumaComplejos2=0;

        for (int x=0; x < array.length; x++){
            if (array[x].getTipo().equals("complejo")){
                sumaComplejos1+=array[x].getValor1();
                sumaComplejos2+=array[x].getValor2();
            }
        }
        System.out.println("La suma de todos los numeros complejos es de: "+sumaComplejos1+", "+sumaComplejos2);
    }
    public static void listarNaturales(Numeros[] array){
        Numeros[] operar= array;
        int contadorN=0;
        for (int x = 0;x<operar.length;x++){
            if (operar[x].getTipo().equals("natural")){
                contadorN=x;
                for (int y=x;y<operar.length;y++){
                    if (operar[x].getTipo().equals("natural")){
                        if (operar[x].getValor1() > operar[y].getValor1() && x!=y){
                            Numeros burbuja = operar[x];
                            operar[x]=operar[y];
                            operar[y]=burbuja;
                        }
                    }
                }
            }
        }
        System.out.println("Los numeros naturales ordenados son: ");
        for (int x=0;x<operar.length;x++) {
            if (operar[x].getTipo().equals("natural") && x==contadorN) {
                System.out.print((int)(operar[x].getValor1()));
            }else if (operar[x].getTipo().equals("natural")){
                System.out.print((int)(operar[x].getValor1())+" , ");
            }

        }
    }
    public static void listarComplejos(Numeros[] array){
        int contadorC=0;
        System.out.println("\nLos numeros complejos son: ");
        for (int x=0;x<array.length;x++){
            if (array[x].getTipo().equals("complejo")) {
                contadorC=x;
            }
        }
        for (int x=0;x<array.length;x++) {
            if (array[x].getTipo().equals("complejo") && contadorC==x) {
                System.out.print("( "+array[x].getValor1()+", "+array[x].getValor2()+" )");
            }else if (array[x].getTipo().equals("complejo")){
                System.out.print("( "+array[x].getValor1()+", "+array[x].getValor2()+" ), ");
            }

        }
    }
}
