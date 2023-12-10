package tp_1;

import java.util.Scanner;

public class DayOfMonthsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String months;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Sélectionner le mois : ");
		months = lectureClavier.nextLine();
		
		int dayNumber;
		
		switch(months) {
			case "Janvier":
			case "Mars":
			case "Mai":
			case "Juillet":
			case "Août":
			case "Octobre":
			case "Décembre":
				dayNumber = 31;
				break;
				
			case "Avril":
			case "Juin":
			case "Septembre":
			case "Novembre":
				dayNumber = 30;
				break;
				
			case "Février":
				int year;
				System.out.print("Sélectionner l'année : ");
				year = lectureClavier.nextInt();
				dayNumber = isBissextile(year) ? 29 : 28;
				lectureClavier.close();
				break;
				
			default:
				System.out.println("Saisie invalide");
				lectureClavier.close();
				return;
		}
		
		System.out.println("Le mois de " + months + " possède " + dayNumber + " jours");
	}
	
	public static boolean isBissextile(int year) {
		if(year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
