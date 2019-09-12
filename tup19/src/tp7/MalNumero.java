package tp7;

public class MalNumero extends ArithmeticException{
	public MalNumero() {
		
	}
	public MalNumero(String mensajeError) {
		super(mensajeError);
	}
}

