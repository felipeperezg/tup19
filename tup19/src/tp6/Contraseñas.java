package tp6;

public class Contraseñas {
	String[] contraseñas;
	int largo;
	String[] elementos={"0","1","2","3","4","5","6","7","8","9","a",
			"b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
			"u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
			"Q","R","S","T","U","V","W","X","Y","Z"};
	
	public Contraseñas (int cantidad, int largo) {
		contraseñas = new String [cantidad];
		this.largo=largo;
	}
	
	public void CrearContraseñas() {
		for (int x=0;x<contraseñas.length;x++) {
			contraseñas[x]="";
			for(int y=1;y<=this.largo;y++) {
				contraseñas[x]+=elementos[(int)(Math.random()*62)];
			}
		}
	}
	public void MostrarContraseñas() {
		for (int x=0;x<contraseñas.length;x++) {
			System.out.print(contraseñas[x]+ ". La cantidad de caracteres de la contraseña es de: "+this.largo+".");
			SeguridadContraseña(contraseñas[x]);
		}
	}
	private void SeguridadContraseña(String contraseña) {
		int cantidadMayus=0, cantidadMinus=0, cantidadNums=0;
		for (int x=0;x<largo;x++) {
			if (contraseña.charAt(x) >= 'A' && contraseña.charAt(x) <='Z') {
				cantidadMayus +=1;
			}else if(contraseña.charAt(x) >= 'a' && contraseña.charAt(x) <='z') {
				cantidadMinus +=1;
			}else {
				cantidadNums +=1;
			}
		}
		if (cantidadNums > 5 && cantidadMinus > 1 && cantidadMayus > 2) {
			System.out.println(" Esta contraseña es segura ("+cantidadNums+" números, "+cantidadMinus+" minúsculas"+", "+cantidadMayus+" mayúsculas.)");
		}else {
			System.out.println(" Esta contraseña es débil ("+cantidadNums+" números, "+cantidadMinus+" minúsculas"+", "+cantidadMayus+" mayúsculas.)");
		}
	}
}
