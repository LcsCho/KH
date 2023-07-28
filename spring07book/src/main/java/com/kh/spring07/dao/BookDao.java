package com.kh.spring07.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring07.dto.BookDto;
import com.kh.spring07.mapper.BookMapper;

@Repository
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookMapper mapper;
	
	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, book_author,"
				+ "book_publication_date, book_price, book_publisher,"
				+ "book_page_count, book_genre)"
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
				dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPublicationDate(),
				dto.getBookPrice(), dto.getBookPublisher(), dto.getBookPageCount(), dto.getBookGenre()
		};
		jdbcTemplate.update(sql, data);
	}

	public boolean update(BookDto dto) {
		String sql = "update book set book_title = ?, book_author = ?"
				+ "where book_id = ?";
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(), dto.getBookId()};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(int bookId) {
		String sql = "delete from book where book_id = ?";
		Object[] data = {bookId};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public List<BookDto> selectList() {
		String sql = "select * from book order by book_id";
		return jdbcTemplate.query(sql, mapper);
	}

	public BookDto selectOne(int bookId) {
		String sql = "select * from book where book_id = ?";
		Object[] data = {bookId};
		List<BookDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
