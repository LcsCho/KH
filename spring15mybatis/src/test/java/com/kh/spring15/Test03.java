package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

@SpringBootTest
public class Test03 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto bookDto = new BookDto();
		bookDto.setBookTitle("감기원정대");
		bookDto.setBookAuthor("조로나");
		bookDto.setBookPublicationDate("2023-10-12");
		bookDto.setBookPrice(100000);
		bookDto.setBookPublisher("보라매병원");
		bookDto.setBookPageCount(200);
		bookDto.setBookGenre("의학");
		sqlSession.insert("book.add", bookDto);
	}
}
