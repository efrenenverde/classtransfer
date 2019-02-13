package BolArr2;

import java.util.ArrayList;
import java.util.Scanner;

//7. Código para eliminar un elemento especifico de un array.  
//Use java.util.Arrays;
public class BolArr2_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(4);
		int pos = 0;
		
		System.out.println(arr.toString());
		
		System.out.println("¿Qué elemento quieres borrar? Introduce su valor");
		pos = sc.nextInt();
		
		for (int i = (arr.size()-1); i>-1;i--)
			if(pos==arr.get(i))
				arr.remove(i);
		
		System.out.println(arr.toString());
		
		sc.close();		
	}
}
