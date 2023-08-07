package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BookDao;
import com.kh.spring10.dto.BookDto;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookDao dao;
	
	@RequestMapping("/detail")
	public String detail(Model model, @RequestParam int bookId) {
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/book/detail.jsp";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<BookDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/book/list.jsp";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/book/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "redirect:list";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam int bookId, Model model) {
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/book/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.updateAll(dto);
		if (result) return "redirect:detail?bookId=" + dto.getBookId();
		return "redirect:에러페이지주소";
	}
	
	// 경로변수(Path Variable) 매핑 처리
	// - 경로 중간에 변수로 사용할 영역을 지정하는 방식
	// - 주소를 간단하게 만들기 위해서 사용
	// - 전달할 값이 많으면 안쓰는게 좋다
	// - @PathVariable로 처리하며 [경로의 끝지점(endpoint)이 달라진다]
	@RequestMapping("/delete/{bookId}")
	public String delete(@PathVariable int bookId) {
		boolean result = dao.delete(bookId);
//		if(result) return "redirect:../list";
		if(result) return "redirect:/book/list";
		else return "redirect:에러페이지";
	}
}
