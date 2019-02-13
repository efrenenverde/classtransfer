package BolArr2;

import java.util.ArrayList;

//26. Código para mover todos los valores 0 al final de un array. Mantenga el orden de los elementos que no sean 0.
public class BolArr2_26 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		do
		arr.add((int)(Math.random()*3));
		while (arr.size()<10);

		System.out.println("Original: "+arr.toString());
		
		for (int i = arr.size()-1; i > -1; i--)
			if (arr.get(i)==0) {
			arr.add(0);
			arr.remove(i);
			}
		
		System.out.println("Ordenado: "+arr.toString());
	}
	
}
