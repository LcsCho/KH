package com.kh.spring10.controller;

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
	@Autowired private PokemonDao dao;
	
	@RequestMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		PokemonDto dto = dao.selectOne(no);
		if (dto == null) return "없는 번호의 몬스터";
		else {
			model.addAttribute("no", dto.getNo());
			model.addAttribute("name", dto.getName());
			model.addAttribute("type", dto.getType());
			return "/WEB-INF/views/test03.jsp";
		}
	}
}
