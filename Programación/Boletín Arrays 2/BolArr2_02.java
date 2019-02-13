package BolArr2;

//2. Código para sumar los valores de un array.
public class BolArr2_02 {

	public static void main(String[] args) {
		int num[] = new int[] { 4, 7, 8, 1, 6 };
		int sum = 0;

		for (int i = 0; i < num.length; i++)
			sum += num[i];
		
		System.out.println("La suma de los valores de este array es: "+sum);
	}

}
