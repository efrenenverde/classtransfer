package BolArr2;

import java.util.ArrayList;

//20. Código para convertir un array en un ArrayList. 
public class BolArr2_20 {
	
	public static void main(String[] args) {
	
		int arr[] = new int[] { 4, 7, 8, 1, 6 };
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length;i++)
			arrL.add(arr[i]);
		
		for (int i = 0; i < arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");
		
		System.out.println(arrL.toString());
	}
}
