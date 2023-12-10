package tp_1;

import java.util.Scanner;

public class CalculPerimetre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Récupération du rayon
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Entrez un rayon : ");
		int rayon = lectureClavier.nextInt();
		lectureClavier.close();
		
		// Calcul du périmètre dans une variable
		double perimetre = 2 * Math.PI * rayon;
		
		//Sortie
		System.out.println("Le périmètre est égal à " + perimetre);	
	}

}
