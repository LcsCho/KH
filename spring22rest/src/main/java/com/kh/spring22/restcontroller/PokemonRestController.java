package com.kh.spring22.restcontroller;

import java.util.List;

import org.springdoc.api.annotations.ParameterObject;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

// 문서용 annotation
@Tag(name = "포켓몬스터 리액트용 백엔드", description = "피카츄")

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
	
	// 목록 매핑에 대한 설명용 annotation
	@Operation(
		description = "포켓몬스터 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(implementation = PokemonDto.class)
						)
					)
				}
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = @Content(
					mediaType = "text/plain",
					schema = @Schema(implementation = String.class),
					examples = @ExampleObject("server error")
				)
			)
		}
	)
	
	@GetMapping("/")
	public List<PokemonDto> list() {
		return pokemonDao.selectList();
	}
	
	// 등록 매핑에 대한 설명용 annotation
	@Operation(
		description = "포켓몬스터 신규 생성",
		responses = {
				@ApiResponse(
					responseCode = "200",
					description = "포켓몬스터 생성 완료"
				),
				@ApiResponse(
					responseCode = "400",
					description = "전송한 파라미터가 서버에서 요구하는 값과 다름"
				),
				@ApiResponse(
					responseCode = "500",
					description = "서버 실행 중 오류가 발생한 경우"
				),
		}
		
		
	)
	
	
	@PostMapping("/")
//	public void insert(@ModelAttribute PokemonDto pokemonDto) { // form-data 수신용
	public void insert(
			@ParameterObject
			@RequestBody PokemonDto pokemonDto) { // request body 직접 해석(ex: JSON)
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
