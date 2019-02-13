package BolArr2;

// 6. Código para encontrar el índice de un elemento de un array
public class BolArr2_06 {

	public static void main(String[] args) {

		int arr[] = new int[] { 4, 7, 8, 3, 5, 1 };
		int val = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				System.out.println(val + " está en este array en posición " + i);
			}
		}
	}
}