package by.htp.hometask.bean;

import java.util.ArrayList;

public class Library {

	private String libraryName;
	public ArrayList<Book> booksList = new ArrayList<>();

	public Library(String libraryName) {
		this.setLibraryName(libraryName);
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public void addBookToLibraryList(Book book) {
		booksList.add(book);
	}
}
