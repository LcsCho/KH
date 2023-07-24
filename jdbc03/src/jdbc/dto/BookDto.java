package jdbc.dto;

import java.sql.Date;

public class BookDto {
	private int book_id;
	private String book_title;
	private String book_author;
	private Date book_publication_date;
	private float book_price;
	private String book_publisher;
	private int book_page_count;
	private String book_genre;
	@Override
	public String toString() {
		return "BookDto [book_id=" + book_id + ", book_title=" + book_title + ", book_author=" + book_author
				+ ", book_publication_date=" + book_publication_date + ", book_price=" + book_price
				+ ", book_publisher=" + book_publisher + ", book_page_count=" + book_page_count + ", book_genre="
				+ book_genre + "]";
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public Date getBook_publication_date() {
		return book_publication_date;
	}
	public void setBook_publication_date(Date book_publication_date) {
		this.book_publication_date = book_publication_date;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public int getBook_page_count() {
		return book_page_count;
	}
	public void setBook_page_count(int book_page_count) {
		this.book_page_count = book_page_count;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public BookDto() {
		super();
	}


}
