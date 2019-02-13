package BolArr2;

import java.util.ArrayList;

//23. Código para comprobar la igualdad de dos arrays.
public class BolArr2_23 {

	public static void main(String[] args) {

		// Creating first arrayList
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

		// Cloning arrL into arrZ
		ArrayList<Integer> arrZ = new ArrayList<Integer>();

		for (int i = 0; i < arrL.size(); i++)
			arrZ.add(arrL.get(i));

		// arrR is arrL, but uneven numbers are changed to make it similar but not the same
		ArrayList<Integer> arrR = new ArrayList<Integer>();

		for (int i = 0; i < arrL.size(); i++)
			arrR.add((int) (arrL.get(i) / 2) * 2);

		compare(arrL, arrR);
		compare(arrL, arrZ);
	}

	// This applies equalsTotal to two arrayLists of Integers, printing the results
	// If equalsTotal is false, it compares each value through equalsIndex, printing
	// only if they have any coincidences.
	static void compare(ArrayList<Integer> arrL, ArrayList<Integer> arrZ) {

		if (equalsTotal(arrL, arrZ))
			System.out.println(arrL + " and " + arrZ + " are equals");

		else {
			System.out.println(arrL + " and " + arrZ + " are not equals");

			for (int i = 0; i < arrL.size(); i++)
				if (equalsIndex(arrL, arrZ, i)) {
					System.out.println("They share a common value " + arrL.get(i) + " at index " + i);
				}
		}
	}

	// This compares the values of two arrayList at the same position
	static boolean equalsIndex(ArrayList<Integer> arr0, ArrayList<Integer> arr1, int pos) {
		if (arr0.get(pos) == arr1.get(pos))
			return true;
		else {
			return false;
		}
	}

	// This compares two whole arrays to each other
	static boolean equalsTotal(ArrayList<Integer> arr0, ArrayList<Integer> arr1) {

		boolean eq = true;

		for (int i = 0; i < arr0.size(); i++)
			if (arr0.get(i) != arr1.get(i))
				eq = false;

		return eq;
	}
}
