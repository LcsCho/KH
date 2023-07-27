package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.PokemonDao;
import com.kh.spring05.dto.PokemonDto;

@RestController
public class PokemonController {

	@Autowired
	private PokemonDao dao;

	@RequestMapping("/insert")
	public String insert(@ModelAttribute PokemonDto dto) {
		dao.insert(dto);
		return "포켓몬 등록 완료!";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute PokemonDto dto) {
		boolean result = dao.update(dto);

		if (result) return "포켓몬스터 정보 변경 완료";
		else return "해당 번호는 존재하지 않습니다.";
	}
}
