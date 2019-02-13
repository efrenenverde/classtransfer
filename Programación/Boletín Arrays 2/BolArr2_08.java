package BolArr2;

import java.util.ArrayList;

//8. Código para copiar un array mediante iteración del mismo.  Use java.util.Arrays;
public class BolArr2_08 {

public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(6);
		arr1.add(7);
		arr1.add(1);
		arr1.add(5);
		arr1.add(9);
		arr1.add(4);
		System.out.println(arr0.toString());
		System.out.println(arr1.toString());
		
		for ( int i = 0; i < arr1.size();i++)
			arr0.add(arr1.get(i));
	
		System.out.println(arr0.toString());
		System.out.println(arr1.toString());
	}
	
}
