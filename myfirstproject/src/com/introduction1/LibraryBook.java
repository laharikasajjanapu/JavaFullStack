package com.introduction1;

public class LibraryBook {
	
	static String LibraryName="Knowledge";
	static String LibrarianName="Anusha";
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	
	static void changeLibrarian() {
		LibrarianName="Meena";
		
	}
	
	void displayBookDetails() {
		System.out.println(" Book ID  :  " + bookId);
		System.out.println("Book Title  :  "+ bookTitle);
		System.out.println("Author Name  :  "+ authorName);
		System.out.println("Available copies  :  "+ availableCopies);
		System.out.println("Library Name  :  "+ LibraryName);
		System.out.println("Librarian Name  :  "+ LibrarianName);
		
	}
	
	void issueBook() {
		availableCopies--;
	}

	public static void main(String[] args) {
		
		LibraryBook book1=new LibraryBook();
		LibraryBook book2=new LibraryBook();
		
		
		changeLibrarian();
		book1.bookId=101;
		book1.bookTitle="Java";
		book1.authorName="Srikanth sir";
		book1.availableCopies=5;
		

		book2.bookId=102;
		book2.bookTitle="MySQL";
		book2.authorName="Vishwanath sir";
		book2.availableCopies=8;
		
		book1.issueBook();
		book1.displayBookDetails();
	
		book2.issueBook();
		book2.displayBookDetails();
		
	}

}
