package tp_1;

import java.util.Scanner;

public class DayOfMonthsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Récupération de l'année
		Scanner selectMonths = new Scanner(System.in);
		System.out.println("Sélectionner le mois : ");
		int months = selectMonths.nextInt();
		selectMonths.close();
		
		int dayNumber;
		
		switch(months) {
			case 1: // January
			case 3: // March
			case 5: // May
			case 7: // July
			case 8: // August
			case 10: // October
			case 12: // December
				dayNumber = 31;
				break;
				
			case 4: // April
			case 6: // June
			case 9: // September
			case 11: // November
				dayNumber = 30;
				break;
				
			case 2: // February
				dayNumber = 28;
				break;
				
			default:
				System.out.println("Saisie invalide");
				return;
		}
		
		System.out.println("Le mois " + months + " possède " + dayNumber + " jours");
	}

}
