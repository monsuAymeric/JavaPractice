package tp_2.LibraryAndBooks;

public class CreateBook {

	//Création des objets
	
	public static Book livre1() {
		return new Book("Le retour de l'IDE blanc Tome 1",
				"John",
				"Doe",
				"Horreur",
				424242);
	}
	
	public static Book livre2() {
		return new Book("Le retour de l'IDE blanc Tome 2",
				"John",
				"Doe",
				"Horreur",
				434343);
	}
	
}