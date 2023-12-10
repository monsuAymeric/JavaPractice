package tp_1;

import java.util.Scanner;

public class UnderageOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Récupération de l'âge
			Scanner lectureClavier = new Scanner(System.in);
			System.out.println("Bienvenue au ProgBar! Quel âge as-tu ?");
			int age = lectureClavier.nextInt();
			lectureClavier.close();
			
		// Vérification de l'âge
			if(age >= 18) {
				System.out.println("Tu peux rentrer. bonne bourre !");
			}
			else {
				System.out.println("L'entrée est interdite au mineur, désolé gamin.");
			}
	}
}
