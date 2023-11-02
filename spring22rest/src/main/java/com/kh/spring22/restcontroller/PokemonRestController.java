package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.PokemonDao;
import com.kh.spring22.dto.PokemonDto;

@CrossOrigin
//@CrossOrigin(value = {"http://localhost:3000", "http://localhost:5500"})
@RestController
@RequestMapping("/pokemon")
public class PokemonRestController {
	
//	아래 다섯 개의 매핑을 이용하여 프론트엔드에 대응하는 Rest 기능을 구현
//	@GetMapping - 조회
//	@PostMapping - 등록
//	@PutMapping - 전체 수정
//	@PatchMapping - 일부 수정
//	@Delete - 삭제
	
	@Autowired
	private PokemonDao pokemonDao;
	
	@GetMapping("/")
	public List<PokemonDto> list() {
		return pokemonDao.selectList();
	}
}
