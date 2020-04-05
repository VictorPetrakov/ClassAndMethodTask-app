package by.htp.hometask.view;

import java.util.List;

import by.htp.hometask.bean.Book;

public class ViewLibrary {

	public void showLibrary(List<Book> booksList) {

		for (Book c : booksList) {
			System.out.println(c);
		}
	}
}
