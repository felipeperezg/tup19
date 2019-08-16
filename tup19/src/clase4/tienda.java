package clase4;

import javax.swing.JOptionPane;

public class tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dimen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de pantalla de su dispositivo movil"));
		int cap = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad en GB de su dispositivo movil"));
		double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de su dispositivo movil"));
		int camara= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la resolución de la pantalla de su dispositivo movil"));
		String tipo = JOptionPane.showInputDialog("Ingrese el tipo de su dispositivo movil");
		
		Movil celular = new Movil(dimen,cap,precio,camara,tipo);
		
		System.out.println(celular.verInfo());
		JOptionPane.showMessageDialog(null, celular.verInfo());
	}

}
