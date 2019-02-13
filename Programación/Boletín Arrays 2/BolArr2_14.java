package BolArr2;

import java.util.ArrayList;

//14. Código para encontrar los elementos comunes a dos arrays de cadenas.
public class BolArr2_14 {

	public static void main(String[] args) {

		ArrayList<String> arr0 = new ArrayList<String>();
		arr0.add("Duplicado");
		arr0.add("9");
		arr0.add("7");
		arr0.add("I");
		arr0.add("5");
		arr0.add("0");
		arr0.add("Duplicatis");
		arr0.add("1");

		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("DuplicaNO");
		arr1.add("8");
		arr1.add("6");
		arr1.add("W");
		arr1.add("4");
		arr1.add("Cero");
		arr1.add("Duplicado");
		arr1.add("1");

		System.out.println(arr0.toString());
		System.out.println(arr1.toString());

		for (int i = 0; i < arr0.size(); i++) {
			for (int j = 0; j < arr1.size(); j++)
				if (arr1.get(i) == arr0.get(j))
					System.out.println(arr1.get(i) + " está duplicado");
		}
	}
}
