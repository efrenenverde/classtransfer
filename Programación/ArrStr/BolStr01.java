package BolStr;

/*1 Contar Letras a
El objetivo de esta actividad es aprender a recorrer un objeto string (una cadena de texto) para tratar los valores que contiene.
Generar un programa en Java llamado CuentaAesString que cuente cuántas letras a contiene una cadena de texto. El texto para tratar
 puede ser cualquiera y lo puede declarar como una constante en el código fuente. */
public class BolStr01 {

	public static void main(String[] args) {
		String cadena = "Aunque la mona se vista de seda, mona se queda";
		char letra = 'a';
		int veces = 0;

		for (int i = 0; i < cadena.length() - 1; i++) {
			if (cadena.charAt(i) == letra)
				veces++;
		}
		System.out.println("El caracter " + letra + " aparece " + veces + " veces.");
	}
}
