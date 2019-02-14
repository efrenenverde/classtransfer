package BolArr2;

import java.util.ArrayList;

//28. Código para encontrar la diferencia entre el mayor y el menor valor de un array de enteros. La longitude del array debe ser uno o superior.  
public class BolArr2_28 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		do
			arr.add((int) (Math.random() * 100));
		while (arr.size() < 10);

		int max = 0, min = 100;

		System.out.println("Original: " + arr.toString());

		for (int i = arr.size() - 1; i > -1; i--) {
			if (arr.get(i) > max)
				max = arr.get(i);
			else if (arr.get(i) < min)
				min = arr.get(i);
		}

		System.out.println(
				"Max value is " + max + " and min value is " + min + ", the difference is " + (max - min));
	}

}
