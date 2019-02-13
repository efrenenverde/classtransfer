package BolArr2;

import java.util.ArrayList;

//25. Código para encontrar los elementos comunes de tres arrays ordenados de forma creciente.
public class BolArr2_25 {

	public static void main(String[] args) {

		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		arr0.add(0);
		arr0.add(1);
		arr0.add(2);
		arr0.add(3);
		arr0.add(4);
		arr0.add(5);
		arr0.add(6);
		arr0.add(7);
		arr0.add(8);
		arr0.add(9);

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(7);
		arr1.add(11);
		arr1.add(12);
		arr1.add(13);
		arr1.add(14);
		arr1.add(15);
		arr1.add(16);
		arr1.add(4);
		arr1.add(18);
		arr1.add(19);

		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(20);
		arr2.add(4);
		arr2.add(22);
		arr2.add(23);
		arr2.add(24);
		arr2.add(25);
		arr2.add(26);
		arr2.add(27);
		arr2.add(28);
		arr2.add(7);

		for (int i = 0; i < arr0.size(); i++) {
			for (int j = 0; j < arr1.size(); j++)
				if (i == arr1.get(j))
					for (int k = 0; k < arr2.size(); k++)
						if (i == arr2.get(k))
							System.out.println(i + " is a common element on this three arrays.");
		}
	}
}
