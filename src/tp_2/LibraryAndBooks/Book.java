package tp_2.LibraryAndBooks;

public class Book {
	
	private String title;
	private String code;
	private String name;
	private String lastName;
	private String category;
	private int bookNumber;
	
	// Constructeur
	public Book(String title, String name, String lastName, String category, int bookNumber) {
		this.title = title;
		this.name = name;
		this.lastName = lastName;
		this.category = category;
		this.bookNumber = bookNumber;
		code = name.substring(0, 2) + lastName.substring(0, 2) + category.substring(0, 1) + bookNumber % 100;
	}
	
	//Fonction pour afficher les attributs
	public String showAttributes() {
			
		// OPTIMISÉ
		
		StringBuilder sb = new StringBuilder();
	    sb.append("Livre =\n")
	      .append("- titre : '").append(title).append("'\n")
	      .append("- name : ").append(name).append("\n")
	      .append("- last name : ").append(lastName).append("\n")
	      .append("- category : ").append(category).append("\n")
	      .append("- bookNumber : ").append(bookNumber).append("\n")
	      .append("- code : ").append(code);
	
	    return sb.toString();
	    
	    // /!\ PAS OPTIMISÉ /!\
		
 		//	return "Livre =" + 
 		//			"\n- titre : " + "'" + title + "'" +
 		//			"\n- name : " + name +
 		//			"\n- last name : " + lastName +
 		//			"\n- category : " + category +
 		//			"\n- bookNumber : " + bookNumber +
 		//			"\n- code : " + code;
	}

}
