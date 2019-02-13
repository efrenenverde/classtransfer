package BolArr2;

import java.util.ArrayList;

//15. Código para encontrar los elementos comunes entre dos arrays de enteros.
public class BolArr2_15 {

	public static void main(String[] args) {

		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		arr0.add(2);
		arr0.add(3);
		arr0.add(7);
		arr0.add(100);
		arr0.add(5);
		arr0.add(0);
		arr0.add(200);
		arr0.add(1);

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(21);
		arr1.add(8);
		arr1.add(6);
		arr1.add(31415);
		arr1.add(4);
		arr1.add(0);
		arr1.add(2);
		arr1.add(10);

		System.out.println(arr0.toString());
		System.out.println(arr1.toString());

		for (int i = 0; i < arr0.size(); i++) {
			for (int j = 0; j < arr1.size(); j++)
				if (arr1.get(i) == arr0.get(j))
					System.out.println(arr1.get(i) + " está duplicado");
		}
	}
	
}
