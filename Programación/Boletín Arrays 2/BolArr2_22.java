package BolArr2;

import java.util.ArrayList;

//22. Código para encontrar todas las parejas de elementos de un array cuya suma sea igual a un número especificado. 
public class BolArr2_22 {

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
		
		for (int i = 0; i < arrL.size(); i++)
			for (int j=i;j<arrL.size();j++)
				if(j != i && (arrL.get(i)+arrL.get(j)==15))
					System.out.println("El valor en posición "+i+" ("+arrL.get(i)+") y el valor en posición "+j+" ("+arrL.get(j)+") suman 15");
	}
}
