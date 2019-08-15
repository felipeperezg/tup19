package clase3;

public class ejercicio1 {

	public static void main(String[] args) {
		int [][] matriz= new int [3][3];
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		System.out.println("Imprimir matriz.");
		for (int x=0;x<3;x++) {
			for (int y=0;y<3;y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
	}

}
