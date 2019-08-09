package lab2tup;

import javax.swing.JOptionPane;

public class TP1 {

	public static void main(String[] args) {
		String nombre;
		int edad;
		do {
			nombre = JOptionPane.showInputDialog("Introduzca su nombre");
			edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
			if (edad==0) {
				break;
			}
			if (edad>=18) {
				System.out.println(nombre+" es mayor de edad");
			}else {
				System.out.println(nombre+" es menor de edad");
			}
		}while (edad!=0);
		System.out.println("Fin del programa.");
	}

}
