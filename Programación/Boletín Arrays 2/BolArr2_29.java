package BolArr2;

import java.util.ArrayList;

//29. Código para calcular el valor promedio de un array de enteros exceptuando los valores mayor y menor.   
public class BolArr2_29 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		do
			arr.add((int) (Math.random() * 100));
		while (arr.size() < 10);

		int max = 0, min = 100, sum = 0;

		System.out.println("Original: " + arr.toString());

		for (int i = arr.size() - 1; i > -1; i--) {
			sum += arr.get(i);
			if (arr.get(i) > max)
				max = arr.get(i);
			else if (arr.get(i) < min)
				min = arr.get(i);
		}

		System.out.println("Maximun value is " + max + " and minimum value is " + min
				+ ", the average value of this arrayList without those is: " + ((sum - max - min) / arr.size() - 2));
	}

}
