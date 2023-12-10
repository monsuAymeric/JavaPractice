package tp_1;

import java.util.Scanner;

public class BissextileOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Récupération de l'année
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Entrez une année : ");
		int annee = lectureClavier.nextInt();
		lectureClavier.close();
			
		// Vérification de l'année et affichage
		if(annee % 4 == 0 && annee % 400 != 0 || annee % 400 == 0) {
			System.out.println("C'est une année bissextile !");
		}
		else {
			System.out.println("Ce n'est pas une année bissextile");
		}
	}

}
