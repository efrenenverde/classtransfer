package BolArr2;

import java.util.ArrayList;
import java.util.Scanner;

//9. Código para insertar un elemento en una posición especifica de un array.
public class BolArr2_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int pos,val;
		arr.add(1);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(4);
		
		System.out.println(arr.toString());
		
		System.out.println("¿Qué valor quieres introducir?");
		val=sc.nextInt();
		System.out.println("¿En qué posición? (Max "+(arr.size()-1)+")");
		pos=sc.nextInt();
		
		arr.add(pos, val);
		
		System.out.println(arr.toString());
		
		sc.close();
	}
}
