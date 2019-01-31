package BolStr;


//4 Subcadena entre uves 
//
//El objetivo de esta actividad es aprender a generar subcadenas a partir de un texto original. 
// 
//Haga un programa en Java llamado SubcadenaV que lea una frase desde el teclado y que muestre
//seg�n el caso un mensaje diferente por pantalla: 
// 
//Si la frase no hay ninguna letra v, hay que mostrar el mensaje: "No hay ninguna v". 
//Si en la frase s�lo hay una letra v, hay que mostrar el mensaje: "S�lo hay una v". 
//Si en la frase hay m�s de una letra viene, hay que mostrar todo el texto comprendido entre la 
//primera y la �ltima (incluidas). 
// 
//Por ejemplo, dada la frase "Hab�a una vez un lugar donde viv�a ...", como resultado se mostrar� 
//"vez un lugar donde viv". 
public class BolStr04 {

	public static void main(String[] args) {

		String cadena="Hab�a una vez un lugar donde viv�a...";
		if(cadena.indexOf('v')==-1) 
			System.out.println("Aqu� no hay Vs");
		else if (cadena.indexOf('v') == cadena.lastIndexOf('v'))
			System.out.println("Hay solo una V");
		else 
			System.out.println(cadena.subSequence(cadena.indexOf('v'), (cadena.lastIndexOf('v')+1)));;
	}
}
