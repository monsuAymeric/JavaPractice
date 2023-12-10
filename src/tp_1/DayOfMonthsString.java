package tp_1;

import java.util.Scanner;

public class DayOfMonthsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Récupération de l'année
		Scanner selectMonths = new Scanner(System.in);
		System.out.println("Sélectionner le mois : ");
		String months = selectMonths.next();
		
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
				// Vérifier si l'année est bissextile
				Scanner selectYear = new Scanner(System.in);
				System.out.println("Sélectionner l'année : ");
				int year = selectYear.nextInt();
				
				if(year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
					dayNumber = 29;
				}
				else {
					dayNumber = 28;
				}
				break;
				
			default:
				System.out.println("Saisie invalide");
				return;
		}
		
		selectMonths.close();
		
		System.out.println("Le mois de " + months + " possède " + dayNumber + " jours");
	}

}
