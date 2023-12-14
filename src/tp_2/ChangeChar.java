package tp_2;

import java.util.Scanner;

public class ChangeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner printString = new Scanner(System.in);
		System.out.println("Type a string : ");
		String originalString = printString.next();
		printString.close();
		
		String changedString = changeChar(originalString);
		
		System.out.println("Original chain : " + originalString + "\nModified chain : " + changedString);
		}
	
	private static 	String changeChar(String chain) {
		char[] caracteres = chain.toCharArray();
		for(int i = 1; i < caracteres.length; i += 2) {
			caracteres[i] = '*';
		}
		return new String(caracteres);
	}
}
