package BolArr2;

import java.util.ArrayList;

//17. Código para encontrar el segundo elemento más largo de un array. 
public class BolArr2_17 {

	public static void main(String[] args) {

		ArrayList<Integer> arr0 = new ArrayList<Integer>();
		arr0.add(2);
		arr0.add(3);
		arr0.add(7);
		arr0.add(511);
		arr0.add(5111);
		arr0.add(0);
		arr0.add(20);
		arr0.add(1);
		
		int max1= 0;
		int max2= 0;
		int solution=0;
		
		System.out.println(arr0.toString());
				
		for (int i = 0; i<arr0.size();i++)
			if (arr0.get(i).toString().length() > max1)
				max1=arr0.get(i).toString().length();
		
		for (int i = 0; i<arr0.size();i++)
			if (arr0.get(i).toString().length() > max2 && arr0.get(i).toString().length() != max1) {
				max2=arr0.get(i).toString().length();
				solution=arr0.get(i);
			}
		
		System.out.println("El segundo número más largo de este array es "+solution);
		
		
	}
	
}
