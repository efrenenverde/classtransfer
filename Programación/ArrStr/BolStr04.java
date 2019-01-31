package BolStr;


//4 Subcadena entre uves 
//
//El objetivo de esta actividad es aprender a generar subcadenas a partir de un texto original. 
// 
//Haga un programa en Java llamado SubcadenaV que lea una frase desde el teclado y que muestre
//según el caso un mensaje diferente por pantalla: 
// 
//Si la frase no hay ninguna letra v, hay que mostrar el mensaje: "No hay ninguna v". 
//Si en la frase sólo hay una letra v, hay que mostrar el mensaje: "Sólo hay una v". 
//Si en la frase hay más de una letra viene, hay que mostrar todo el texto comprendido entre la 
//primera y la última (incluidas). 
// 
//Por ejemplo, dada la frase "Había una vez un lugar donde vivía ...", como resultado se mostrará 
//"vez un lugar donde viv". 
public class BolStr04 {

	public static void main(String[] args) {

		String cadena="Había una vez un lugar donde vivía...";
		if(cadena.indexOf('v')==-1) 
			System.out.println("Aquí no hay Vs");
		else if (cadena.indexOf('v') == cadena.lastIndexOf('v'))
			System.out.println("Hay solo una V");
		else 
			System.out.println(cadena.subSequence(cadena.indexOf('v'), (cadena.lastIndexOf('v')+1)));;
	}
}
