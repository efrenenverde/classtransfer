package BolStr;

import java.util.Scanner;

//3 Llenar un "array" de cadenas de texto 
//
//El objetivo de esta actividad es aprender a leer palabras por el teclado y llenar arrays que contienen cadenas de texto. 
//Haga un programa en Java llamado InvierteArrayTexto que lea 5 palabras (no frases) desde el teclado. Cada palabra debe 
//estar en una l�nea de texto diferente. Si en una misma l�nea de texto se escribe m�s de una palabra, s�lo hay que prever
//la primera, y el resto se ignoran. 
//Con las 5 palabras le�das, es necesario rellenar un array. Al terminar, usando este array, hay que mostrar las palabras
//en orden inverso respecto a c�mo han entrado (primero la �ltima, despu�s la pen�ltima, etc.).
public class BolStr03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[5];
		
		for (int j = 0; j<palabras.length;j++) {
			System.out.println("Dime la palabra numero"+(j+1));
			palabras[j]= sc.nextLine();
		}
		for (int j=palabras.length-1;j>=0;j--)
			System.out.println(palabras[j]);
		
	sc.close();
	}
}
