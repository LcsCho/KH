package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.BookDao;
import com.kh.spring07.dto.BookDto;

@RestController
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	@RequestMapping("/save")
	public String insert(
		@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "책 등록 완료";
	}
	
	@RequestMapping("/edit")
	public String update(@ModelAttribute BookDto dto) {
		if (dao.update(dto)) return "책 정보 변경 완료";
		else return "해당 책은 존재하지 않습니다.";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int bookId) {
		if (dao.delete(bookId)) return "삭제 완료";
		else return "존재하지 않는 책";
	}
	
	@RequestMapping("/list")
	public String list() {
		List<BookDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for (BookDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String selectOne(@RequestParam int bookId) {
		BookDto dto = dao.selectOne(bookId);
		if (dto == null) return "없는 책";
		else {
//			return dto.toString();
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto);
			return buffer.toString();
		}
	}
}
