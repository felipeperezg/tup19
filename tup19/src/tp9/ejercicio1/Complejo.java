package tp9.ejercicio1;

public class Complejo extends Numeros implements ParaNumeros {
    double valor1, valor2;
    public Complejo(double valor1, double valor2){
        this.valor1=valor1;
        this.valor2=valor2;
    }

    @Override
    public void suma(Numeros n1) {
    	System.out.println("La suma de los números es de: ("+(this.valor1+n1.getValor1())+", "+(this.valor2+n1.getValor2())+")");
    }

    @Override
    public void resta(Numeros n1) {
    	System.out.println("La resta de los números es de: ("+(this.valor1-n1.getValor1())+", "+(this.valor2-n1.getValor2())+")");
    }

    @Override
    public void multiplicacion(Numeros n1) {
    	System.out.println("La multiplicación de los números es de: ("+((this.valor1*n1.getValor1())-(this.valor2*n1.getValor2()))+", "+((this.valor2*n1.getValor1())+this.valor1*n1.getValor2())+")");
    }
    @Override
    public String getTipo() {
        return "complejo";
    }

    @Override
    public double getValor1(){
        return this.valor1;
    }
    @Override
    public double getValor2(){
        return this.valor2;
    }
}
