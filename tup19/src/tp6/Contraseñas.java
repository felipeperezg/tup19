package tp6;

public class Contrase�as {
	String[] contrase�as;
	int largo;
	String[] elementos={"0","1","2","3","4","5","6","7","8","9","a",
			"b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
			"u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
			"Q","R","S","T","U","V","W","X","Y","Z"};
	
	public Contrase�as (int cantidad, int largo) {
		contrase�as = new String [cantidad];
		this.largo=largo;
	}
	
	public void CrearContrase�as() {
		for (int x=0;x<contrase�as.length;x++) {
			contrase�as[x]="";
			for(int y=1;y<=this.largo;y++) {
				contrase�as[x]+=elementos[(int)(Math.random()*62)];
			}
		}
	}
	public void MostrarContrase�as() {
		for (int x=0;x<contrase�as.length;x++) {
			System.out.print(contrase�as[x]+ ". La cantidad de caracteres de la contrase�a es de: "+this.largo+".");
			SeguridadContrase�a(contrase�as[x]);
		}
	}
	private void SeguridadContrase�a(String contrase�a) {
		int cantidadMayus=0, cantidadMinus=0, cantidadNums=0;
		for (int x=0;x<largo;x++) {
			if (contrase�a.charAt(x) >= 'A' && contrase�a.charAt(x) <='Z') {
				cantidadMayus +=1;
			}else if(contrase�a.charAt(x) >= 'a' && contrase�a.charAt(x) <='z') {
				cantidadMinus +=1;
			}else {
				cantidadNums +=1;
			}
		}
		if (cantidadNums > 5 && cantidadMinus > 1 && cantidadMayus > 2) {
			System.out.println(" Esta contrase�a es segura ("+cantidadNums+" n�meros, "+cantidadMinus+" min�sculas"+", "+cantidadMayus+" may�sculas.)");
		}else {
			System.out.println(" Esta contrase�a es d�bil ("+cantidadNums+" n�meros, "+cantidadMinus+" min�sculas"+", "+cantidadMayus+" may�sculas.)");
		}
	}
}
