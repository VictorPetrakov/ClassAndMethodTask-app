package by.htp.hometask.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.hometask.bean.Book;

public class LibraryLogic {

	public List<Book> getListByAuthor(List<Book> booksList, String author) {
		List<Book> list = new ArrayList<>();
		for (Book c : booksList) {
			if (c.getAuthor().equals(author)) {
				list.add(c);
			}
		}
		return list;
	}
	
	public List<Book> getListByPublishingHouse(List<Book> booksList, String publishingHouse) {
		List<Book> list = new ArrayList<>();
		for (Book c : booksList) {
			if (c.getPublishingHouse().equals(publishingHouse)) {
				list.add(c);
			}
		}
		return list;
	}

	public List<Book> getListByYear(List<Book> booksList, int publishYear) {
		List<Book> list = new ArrayList<>();
		for (Book c : booksList) {
			if (c.getYear() > publishYear) {
				list.add(c);
			}
		}
		return list;
	}
}
