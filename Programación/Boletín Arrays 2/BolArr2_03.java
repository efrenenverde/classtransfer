package BolArr2;

//3. Código para imprimir la siguiente rejilla de ceros. Use un array bidimensional.   
//Salida Esperada:
// 0  0  0  0  0  0 
// 0  0  0  0  0  0 
// 0  0  0  0  0  0 
// 0  0  0  0  0  0 
// 0  0  0  0  0  0 
// 0  0  0  0  0  0
public class BolArr2_03 {

	public static void main(String[] args) {
		
		int arr[][] = new int[6][6];
		
		for (int i = 0; i<6;i++) {
			for (int j = 0; j < 6; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println(" ");
		}
	}
}
