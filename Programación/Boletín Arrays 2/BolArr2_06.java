package BolArr2;

// 6. C�digo para encontrar el �ndice de un elemento de un array
public class BolArr2_06 {

	public static void main(String[] args) {

		int arr[] = new int[] { 4, 7, 8, 3, 5, 1 };
		int val = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				System.out.println(val + " est� en este array en posici�n " + i);
			}
		}
	}
}