package BolArr2;
import java.util.Arrays;

//1. Código para ordenar un array numérico de enteros y un array de Strings.  
//Use java.util.Arrays;
public class BolArr2_01 {
	
	public static void main(String[] args) {
		
		int num[] = new int[] {4,5,8,6,2,7,3,1,0,9};
		String Str[] = new String[] {"Cuando tal", "Bueno a ver", "Entidades", "Desde entonces", "A veces"};
		
		System.out.println("Array num original: "+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("Array num reordenado: "+Arrays.toString(num));
		
		System.out.println("Array Str original: "+Arrays.toString(Str));
		Arrays.sort(Str);
		System.out.println("Array Str reordenado: "+Arrays.toString(Str));
	}

}
