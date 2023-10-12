package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto bookDto = new BookDto();
		bookDto.setBookId(3);
		bookDto.setBookTitle("조준희의심한감기");
		
		int count = sqlSession.update("book.edit", bookDto);
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
