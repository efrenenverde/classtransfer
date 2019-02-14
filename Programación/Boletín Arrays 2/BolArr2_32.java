package BolArr2;
import java.util.Scanner;
import java.util.ArrayList;

//32. Código para testear si un array de enteros contiene dos valores específicos por ejemplo 65 y 77. 
public class BolArr2_32 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(7);
		arr.add(5);
		arr.add(8);
		arr.add(2);
		arr.add(14);
		arr.add(9);
		arr.add(1);
		arr.add(6);
		arr.add(15);
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arr.toString());
		
		System.out.println("Please enter the first number");
		num=sc.nextInt();
		search(arr,num);
		
		System.out.println("\nPlease enter the second number");
		num=sc.nextInt();
		search(arr,num);
				
		sc.close();
	}

	static void search(ArrayList<Integer> arr, int num) {
		
		boolean found = false;
		
		for (int i = 0; i < arr.size(); i++)
			if (arr.get(i)==num) {
				found = true;
				System.out.println("This array contains number "+num);
			}
		
		if (!found)
			System.out.println("This array does NOT contain number "+num);
	}
	
}
