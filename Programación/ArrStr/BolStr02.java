package BolStr;

import java.util.Scanner;

// 2 Palabras impares 
// El objetivo de esta actividad es aprender a dividir frases en palabras individuales, que puedan ser fácilmente procesadas. 
// 
// Haga un programa en Java llamado PalabrasImpares que lea una frase escrita en una sola línea desde el teclado y a
// continuación escriba las palabras que hay en posición impar (la primera, la tercera, etc.). Por ejemplo, si escribe 
// "Había una vez un lugar ...", se mostrará "Habia una un".
public class BolStr02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase.");
		String cadena = sc.nextLine();

		// Troceamos y guardamos en un Array de Strings
		String[] palabras = cadena.split(" ");

		for (int i = 0; i < palabras.length; i += 2)
			System.out.print(palabras[i]+" ");

		sc.close();
	}
}
