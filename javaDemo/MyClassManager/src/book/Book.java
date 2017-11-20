package book;

public class Book {
	String bookName;
	String author;
	String publishers;
	double price;
	Information info;
	
	
	public Book() {
		super();
	}
	
	
	public Book(String bookName, String author, String publishers, double price,Information info) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.publishers = publishers;
		this.price = price;
		this.info = info;
	}


	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author
				+ ", publishers=" + publishers + ", price=" + price + "]";
	}
	
}
