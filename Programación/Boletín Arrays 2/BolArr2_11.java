package BolArr2;

import java.util.ArrayList;
import java.util.Collections;

public class BolArr2_11 {
	// 11. Código para invertir un array de enteros.

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(4);
		arr.add(10);

		System.out.println(arr.toString());
		
		for ( int i = 0; i<arr.size()/2;i++) {
			Collections.swap(arr, i, (arr.size()-1-i));
		}
		System.out.println(arr.toString());
	}
}