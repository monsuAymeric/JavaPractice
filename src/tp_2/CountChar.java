package tp_2;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner selectChar = new Scanner(System.in);
		System.out.println("Type a string : ");
		String countChar = selectChar.next();
		selectChar.close();
		
		int stringLength = countChar.length();
		System.out.println("Number of char : " + stringLength);
	}
}
