package BolArr2;

//5. Código para comprobar si un array contiene un valor especifico. 
public class BolArr2_05 {

	public static void main(String[] args) {

		int arr[] = new int[] {4, 7, 8, 3 , 5 , 1};
		int val = 17;
		boolean there = false;

		for (int i = 0; i < arr.length; i++)
			if ( arr[i] == val) {
				System.out.println(val+" está en este array");
				there = true;
			}
	
		if (!there)
			System.out.println(val+" no está en este array");
	}
}