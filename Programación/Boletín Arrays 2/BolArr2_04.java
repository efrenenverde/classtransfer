package BolArr2;

//4. Código para calcular el valor promedio de un array de enteros.
public class BolArr2_04 {

	public static void main(String[] args) {

		int arr[] = new int[] {4, 7, 8, 3 , 5 , 1};
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		System.out.println("La media de este array es "+(sum/arr.length));
	}	
}
