package tp_2.LibraryAndBooks;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book livre1 = CreateBook.livre1();
		Book livre2 = CreateBook.livre2();
		
		System.out.println(livre1.showAttributes() + "\n\n" + livre2.showAttributes());
	}

}
