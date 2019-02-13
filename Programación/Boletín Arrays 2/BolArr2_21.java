package BolArr2;

import java.util.ArrayList;

//21. Código para convertir un ArrayList a un array. 
public class BolArr2_21 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		for (int i = 0; i < arr.length;i++)
			arrL.add((int) (Math.random()*100));
		
		for (int i = 0; i < arr.length;i++)
			arr[i]=arrL.get(i);
		
		for (int i = 0; i < arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");
		
		System.out.println(arrL.toString());
		
		
		
	}
}
