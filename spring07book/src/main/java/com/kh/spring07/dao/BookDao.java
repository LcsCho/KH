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
	private BookMapper bookMapper;
	
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
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<BookDto> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public BookDto selectOne(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}
}
