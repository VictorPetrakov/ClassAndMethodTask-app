package by.htp.hometask.bean;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  
//toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и  методами. 
//Задать критерии выбора данных и вывести эти данные на консоль.  

//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
//Найти и вывести:  
//a) список книг заданного автора;  
//b) список книг, выпущенных заданным издательством;  
//c) список книг, выпущенных после заданного года. 

public class Book {
	
	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int year;
	private int numberOfPages;
	private String price;
	private String typeOfCover;

	public Book() {

	}

	public Book(int id, String title, String author, String publishingHouse, int year, int numberOfPages, String price,
			String typeOfCover) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfCover = typeOfCover;

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTypeOfCover() {
		return typeOfCover;
	}

	public void setTypeOfCover(String typeOfCover) {
		this.typeOfCover = typeOfCover;
	}

	public String toString() {
		return String.format(
				"ID: %d\t title:  %24s\t author: %15s\t publishingHouse: %6s\t year: %d\t numberOfPages %d\t price: %s\t typeOfCover: %s",
				id, title, author, publishingHouse, year, numberOfPages, price, typeOfCover);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfCover == null) ? 0 : typeOfCover.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfCover == null) {
			if (other.typeOfCover != null)
				return false;
		} else if (!typeOfCover.equals(other.typeOfCover))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	

}
