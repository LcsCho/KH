package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
