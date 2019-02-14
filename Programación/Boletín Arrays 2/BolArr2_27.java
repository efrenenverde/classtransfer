package BolArr2;

import java.util.ArrayList;

//27. Código para encontrar el número de valores pares e impares de un array de enteros.  
public class BolArr2_27 {

public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		do
		arr.add((int)(Math.random()*3));
		while (arr.size()<10);

		int par = 0, imp = 0;
		
		System.out.println("ArrayList: "+arr.toString());
		
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i)%2==0)
				par++;
			else
				imp++;
		
		System.out.println("Hay "+par+" valores pares y "+imp+" valores impares.");
	}
}
