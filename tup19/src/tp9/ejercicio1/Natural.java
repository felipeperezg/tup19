package tp9.ejercicio1;

public class Natural extends Numeros implements ParaNumeros {
    private int valor;
    public Natural(int valor){
        this.valor=valor;
    }
    @Override
    public double getValor1(){
        return this.valor;
    }
    @Override
    public double getValor2(){
        return 0;
    }

    @Override
    public void suma(Numeros n1) {
        System.out.println("La suma da como resultado: "+(this.valor+(((Natural)n1).valor)));
    }

    @Override
    public void resta(Numeros n1) {
        System.out.println("La resta da como resultado: "+(this.valor-(((Natural)n1).valor)));
    }

    @Override
    public void multiplicacion(Numeros n1) {
        System.out.println("La multiplicacion da como resultado: "+(this.valor*(((Natural)n1).valor)));
    }

    @Override
    public String getTipo() {
        return "natural";
    }
}
