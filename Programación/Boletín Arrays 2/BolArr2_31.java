package BolArr2;

import java.util.ArrayList;

//31. Código para comprobar si la suma de los elementos del
//array de valor 10 es exactamente 30. Return false si no
//se cumple la condición, si se cumple return true.
public class BolArr2_31 {
	
	//Returns true if the total of the values inside of an array of 10 is 30
	boolean tenTotal(ArrayList<Integer> arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.size(); i++)
			sum+=arr.get(i);
			
		if(sum==30)
			return true;
		else
			return false;
	}
	
	//Returns true if the total of the values equal to 10 inside of an array is 30
	boolean tenTens(ArrayList<Integer> arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i)==10)
				sum+=arr.get(i);
			
		if(sum==30)
			return true;
		else
			return false;
	}

}
