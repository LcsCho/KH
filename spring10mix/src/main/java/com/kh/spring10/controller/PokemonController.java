package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.PokemonDao;
import com.kh.spring10.dto.PokemonDto;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {
	@Autowired
	private PokemonDao dao;

	// 상세조회
	// - 번호(no)를 받아서 포켓몬스터정보(PokemonDto)를 조회
	// - 화면(JSP)에 전달하도록 모델(Model)에 첨부
	@RequestMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		PokemonDto dto = dao.selectOne(no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/pokemon/detail.jsp";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<PokemonDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/pokemon/list.jsp";
	}
	
	// 등록
	// - 등록은 주소를 둘로 나눠서 쓴다.
	// - GET(입력), POST(처리)
	// - @GetMapping, @PostMapping 이라는 애너테이션 사용
	
	// @RequestMapping("/insert")
	// @RequestMapping(value = "/insert", method = RequestMethod.GET)
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/pokemon/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute PokemonDto dto) {
		dao.insert(dto);
		// 더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
		// 반환하는 문자열이 redirect:로 시작하면 스프링이 리다이렉트 처리한다.
		return "redirect:list"; // 상대경로
//		return "redirect:/pokemon/list";
	}
	
	// 수정
	// - 수정 역시 등록처럼 두 개의 매핑이 필요(작성, 처리)
	// - 전송방식으로 구분하여 구현
	// - 화면에 기존 정보를 표시할 수 있도록 조회하여 전달
	
	@GetMapping("/edit")
	public String edit(@RequestParam int no, Model model) {
		PokemonDto dto = dao.selectOne(no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/pokemon/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute PokemonDto dto) {
		boolean result = dao.update(dto);
		if (result) return "redirect:detail?no=" + dto.getNo(); // 성공 시 상세 페이지로 리다이렉트
		else return "redirect:에러페이지주소";
	}
	// 삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean result = dao.delete(no);
		if(result) return "redirect:list";
		else return "redirect:에러페이지";
	}
}
