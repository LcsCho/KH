package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("책번호: ");
//		int bookNumber = 143;
		// System.out.print("책이름: ");
		String bookTitle = "asd1f";
		// System.out.print("책저자: ");
		String bookAuthor = "asdf";
		// System.out.print("책출판일: ");
		String bookPublicationDate = "1998-01-01";
				
		// System.out.print("책가격: ");
		double bookPrice = 35.55;
		// System.out.print("책출판사: ");
		String bookPublisher = "asdf";
		// System.out.print("책페이지: ");
		int bookPageCount = 144;
		// System.out.print("책장르: ");
		String bookGenre = "소설";
		
		String sql = "INSERT INTO book(book_id, book_title, book_author, book_publication_date,"
				+ " book_price, book_publisher, book_page_count, book_genre) "
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {bookTitle, bookAuthor, 
				bookPublicationDate, bookPrice, 
				bookPublisher, bookPageCount,
				bookGenre};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		System.out.println("Success");
	}
}
