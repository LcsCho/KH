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
//		BookDto bookDto = new BookDto();
//		bookDto.setBookTitle("감기원정대");
//		bookDto.setBookAuthor("조로나");
//		bookDto.setBookPublicationDate("2023-10-12");
//		bookDto.setBookPrice(100000);
//		bookDto.setBookPublisher("보라매병원");
//		bookDto.setBookPageCount(200);
//		bookDto.setBookGenre("의학");
		
//		BookDto bookDto = BookDto.builder().build();
		
		sqlSession.insert("book.add", BookDto.builder()
				.bookTitle("감기원정대")
				.bookAuthor("조로나")
				.bookPublicationDate("2023-10-12")
				.bookPrice(25000)
				.bookPublisher("보라매병원")
				.bookPageCount(444)
				.bookGenre("질병")
				.build());
	}
}
