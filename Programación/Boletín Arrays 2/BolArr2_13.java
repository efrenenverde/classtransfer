package BolArr2;

import java.util.ArrayList;

//13. Código para encontrar los valores duplicados de un array de cadenas.
public class BolArr2_13 {

public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Duplicado");
		arr.add("9");
		arr.add("7");
		arr.add("I");
		arr.add("5");
		arr.add("0");
		arr.add("Duplicado");
		arr.add("1");

		System.out.println(arr.toString());
		
		for ( int i = 0; i<arr.size()-1;i++) {
			for ( int j = i+1; j<arr.size();j++)
				if (arr.get(i)==arr.get(j))
					System.out.println(arr.get(i)+" está duplicado");
		}
	}
}
