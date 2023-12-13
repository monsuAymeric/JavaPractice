package tp_2;

import java.util.Scanner;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner printString = new Scanner(System.in);
		System.out.println("Type a string : ");
		String stringLowerAndUpper = printString.next();
		printString.close();
		
		System.out.println("Default : " + stringLowerAndUpper);
		System.out.println("UpperCase : " + stringLowerAndUpper.toUpperCase());
		System.out.println("LowerCase : " + stringLowerAndUpper.toLowerCase());
	}

}
