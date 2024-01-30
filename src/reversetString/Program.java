package reversetString;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*
		 * Para fazer uma Reverse String temos 3 possibilidades 
		 * PRIMEIRA > Usando JAVA API
		 * SEGUNDA > Usando Loop
		 * TERCEIRA > Usando swap - e mais perfomatica.
		 */
		
		System.out.println(reverseString("Marcos Mendes"));	
		
		sc.close();

	}
	
	/*Usando o JAVA API
	private static String reverseString (String string) {
		var stringBuffer = new StringBuffer(string);
		return stringBuffer.reverse().toString();
	}
	*/
	

	/*
	 * A String nada mais e que uma array de caracteres então basta fazer um loop
	 * e ir quardando cada letra inversamente (decrementando)
	 */
	private static String reverseString (String string) {
		
		StringBuilder reversed = new StringBuilder();
		for (int i = string.length() - 1; i>=0; i--) {
			reversed.append(string.charAt(i));
		}
		return reversed.toString();
	}
	
}
