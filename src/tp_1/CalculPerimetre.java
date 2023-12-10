package tp_1;

import java.util.Scanner;

public class CalculPerimetre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Entrez un rayon : ");
		int rayon = lectureClavier.nextInt();
		lectureClavier.close();
		
		double perimetre = 2 * Math.PI * rayon;
		
		System.out.println("Le périmètre est égal à " + perimetre);	
	}

}
