package BolArr2;

import java.util.ArrayList;

//18. Código para encontrar el segundo elemento más pequeño de un array.
public class BolArr2_18 {

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
		
		// Los inicio en 10 porque en 0 me fastidian la fórmula luego
		int max1= 10;
		int max2= 10;
		int solution= 10;
		
		System.out.println(arr0.toString());
				
		for (int i = 0; i<arr0.size();i++)
			if (arr0.get(i).toString().length() < max1)
				max1=arr0.get(i).toString().length();
		
		for (int i = 0; i<arr0.size();i++)
			if (arr0.get(i).toString().length() < max2 && arr0.get(i).toString().length() != max1) {
				max2=arr0.get(i).toString().length();
				solution=arr0.get(i);
			}
		
		System.out.println("El segundo número más corto de este array es "+solution);
		
		
	}
}
