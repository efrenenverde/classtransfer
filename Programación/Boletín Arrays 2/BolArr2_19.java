package BolArr2;

import java.util.ArrayList;

//19. Código para sumar dos arrays del mismo tamaño. 
public class BolArr2_19 {
	
	public static void main(String[] args) {

		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		arr0.add(2);
		arr0.add(30);
		arr0.add(700);
		arr0.add(511);
		arr0.add(5111);
		arr0.add(000);
		arr0.add(200);
		arr0.add(100);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(4);
		arr1.add(40);
		arr1.add(400);
		arr1.add(541);
		arr1.add(5141);
		arr1.add(400);
		arr1.add(240);
		arr1.add(104);
		
		ArrayList<Integer> arrS = new ArrayList<Integer>();
		
		for (int i = 0; i < arr0.size();i++)
			arrS.add(arr0.get(i)+arr1.get(i));	
	
		System.out.println(arrS.toString());
	}
	
}
