package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/")
//	public void insert(@ModelAttribute PokemonDto pokemonDto) { // form-data 수신용
	public void insert(@RequestBody PokemonDto pokemonDto) { // request body 직접 해석(ex: JSON)
		pokemonDao.insert(pokemonDto);
	}
	
	// 파라미터는 주소가 매우 지저분해지므로 최대한 경로변수를 활용
	@DeleteMapping("/{no}")
//	public boolean delete(@PathVariable int no) { // 데이터를 반환하면 상태설정이 불가능
	public ResponseEntity<String> delete(@PathVariable int no) {
		boolean result = pokemonDao.delete(no);
		if (result)return ResponseEntity.status(200).build(); // ResponseEntity.ok().build();
		else return ResponseEntity.status(404).build(); // ResponseEntity.notFound().build();
	}
	
	@GetMapping("/{no}")
	public ResponseEntity<PokemonDto> find(@PathVariable int no) {
		PokemonDto pokemonDto = pokemonDao.selectOne(no);
		boolean result = pokemonDto != null;
		if (result) return ResponseEntity.ok(pokemonDto);
		else return ResponseEntity.notFound().build(); 
	}
	
	@PutMapping("/{no}")
	public ResponseEntity<String> edit(@PathVariable int no, @RequestBody PokemonDto pokemonDto) {
		boolean result = pokemonDao.edit(no, pokemonDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build() ;
	}
	
	@PatchMapping("/{no}")
	public ResponseEntity<String> editUnit(
			@PathVariable int no, @RequestBody PokemonDto pokemonDto) {
		if (pokemonDto.isEmpty()) return ResponseEntity.badRequest().build();
		boolean result = pokemonDao.editUnit(no, pokemonDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
	
		
}
