package BolArr2;

import java.util.ArrayList;
import java.util.Collections;

//10. Código para encontrar los valores máximo y mínimo de un array.  
public class BolArr2_10 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(6);
		arr.add(7);
		arr.add(11);
		arr.add(5);
		arr.add(9);
		arr.add(4);
		
		System.out.println(arr.toString());
		
		System.out.println("Max: "+Collections.max(arr)+"\nMin: "+Collections.min(arr));
		
		
	}
}
