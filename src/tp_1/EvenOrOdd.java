package tp_1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Récupération du chiffre
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Indiquer un chiffre : ");
		int number = lectureClavier.nextInt();
		lectureClavier.close();
		
		// Vérification pair ou impair
		if(number % 2 == 0) {
			System.out.println("C'est une nombre pair !");
		}
		else {
			System.out.println("C'est un nombre impair !");
		}
	}

}
