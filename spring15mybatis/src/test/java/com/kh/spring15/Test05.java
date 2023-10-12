package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		
		int result = sqlSession.delete("book.del", BookDto.builder()
				.bookId(4)
				.build());
		log.debug("result={}", result);
	}
}
