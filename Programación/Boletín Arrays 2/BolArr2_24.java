package BolArr2;

import java.util.ArrayList;

//24. Código para encontrar un número perdido en un array numérico ordenado.  
public class BolArr2_24 {

	public static void main(String[] args) {

		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(0);
		arrL.add(7);
		arrL.add(5);
		arrL.add(8);
		arrL.add(2);
		arrL.add(14);
		arrL.add(9);
		arrL.add(1);
		arrL.add(6);
		arrL.add(15);

		int target = 14;
		boolean found=false;
		
		arrL.sort(null);
		
		System.out.println(arrL.toString());
		
		for (int i = 0; i < arrL.size(); i++)
			if (arrL.get(i)==target) {
				System.out.println("Value "+target+" is at index "+i+".");
				found=true;
			}
		if (!found)
			System.out.println("Value "+target+" could not be found.");
	}
}