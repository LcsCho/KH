package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.util.JdbcUtils;

public class BookDao {
	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, book_author, book_publication_date, book_price,"
				+ "book_publisher, book_page_count, book_genre) "
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {dto.getBook_title(), dto.getBook_author(), dto.getBook_publication_date(),
				dto.getBook_price(), dto.getBook_publisher(), dto.getBook_page_count(), dto.getBook_genre()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
}
