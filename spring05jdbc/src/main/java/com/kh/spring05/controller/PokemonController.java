package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean result = dao.delete(no);
		
		if (result) return "삭제 완료";
		else return "존재하지 않는 몬스터";
	}
	@RequestMapping("/list")
	public String list() {
		List<PokemonDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for (PokemonDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	@RequestMapping("/detail")
	public String selectOne(@RequestParam int no) {
		PokemonDto dto = dao.selectOne(no);
		if (dto == null) return "없는 번호의 몬스터";
		else {
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto);
			return buffer.toString();
		}
	}
}
