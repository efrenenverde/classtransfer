package BolArr2;

import java.util.ArrayList;

//12. Código para encontrar los valores duplicados de un array de enteros.  
public class BolArr2_12 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(8);
		arr.add(9);
		arr.add(7);
		arr.add(1);
		arr.add(5);
		arr.add(0);
		arr.add(4);
		arr.add(1);

		System.out.println(arr.toString());
		
		for ( int i = 0; i<arr.size()-1;i++) {
			for ( int j = i+1; j<arr.size();j++)
				if (arr.get(i)==arr.get(j))
					System.out.println(arr.get(i)+" está duplicado");
		}		
		
		
		
	}
}
