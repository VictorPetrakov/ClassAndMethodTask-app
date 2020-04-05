package by.htp.hometask.main;

import java.util.List;

import by.htp.hometask.bean.Book;
import by.htp.hometask.bean.Library;
import by.htp.hometask.logic.LibraryLogic;
import by.htp.hometask.view.ViewLibrary;

public class DemoLibrary {
	public static void main(String[] args) {
		Library libraryLenina = new Library("Ленина");
		LibraryLogic logic = new LibraryLogic();
		ViewLibrary view = new ViewLibrary();

		libraryLenina.addBookToLibraryList(new Book(0, "Вий     ", "Гоголь Н.В", "Питер", 1975, 532, "23р50к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(1, "Война и мир", "Толстой Л.Н", "Москва", 1965, 1523, "50р50к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(2, "Мертвые души", "Гоголь Н.В", "Питер", 1973, 445, "23р50к", "Мягкий"));
		libraryLenina.addBookToLibraryList(new Book(3, "Мастер и Маргарита", "Булгаков М.А", "Минск", 1992, 600, "30р23к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(4, "Басни    ", "Крылов И.А", "Питер", 1998, 286, "12р40к", "Мягкий"));
		libraryLenina.addBookToLibraryList(new Book(5, "Преступление и наказание", "Достоевский Ф.М", "Минск", 1969, 756, "35р10к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(6, "Тарас Бульба", "Гоголь Н.В", "Москва", 1984, 742, "33р50к", "Твердый"));

		view.showLibrary(libraryLenina.booksList);
		

		System.out.println("\nКниги автора:");

		List<Book> listSortByAuthor = logic.getListByAuthor(libraryLenina.booksList, "Гоголь Н.В");
		
		view.showLibrary(listSortByAuthor);

		System.out.println("\nКниги издательства:");

		List<Book> listSortByPublishingHouse = logic.getListByPublishingHouse(libraryLenina.booksList, "Питер");
		
		view.showLibrary(listSortByPublishingHouse);

		System.out.println("\nКниги выпущенные после заданного года:");

		List<Book> listSortByYear = logic.getListByYear(libraryLenina.booksList, 1984);
		
		view.showLibrary(listSortByYear);
	}
}
