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

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

// 문서용 annotation
@Tag(name = "도서 리액트용 백엔드", description = "해리포터")

@CrossOrigin
//@CrossOrigin(value = {"http://localhost:3000", "http://localhost:5500"})
@RestController
@RequestMapping("/book")
public class BookRestController {
	
	
	@Autowired
	private BookDao bookDao;
	
	@Operation(
		description = "도서 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(implementation = BookDto.class)
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
	public List<BookDto> list() {
		return bookDao.selectList();
	}
	
	// 등록 매핑에 대한 설명용 annotation
	@Operation(
		description = "도서 신규 생성",
		responses = {
				@ApiResponse(
					responseCode = "200",
					description = "도서 생성 완료"
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
	public void insert(
			@Parameter(
				description = "생성할 도서 객체",
				required = true,
				schema = @Schema(implementation = BookDto.class)
			)
			@RequestBody BookDto bookDto) { // request body 직접 해석(ex: JSON)
		bookDao.insert(bookDto);
	}
	
	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> delete(@PathVariable int bookId) {
		boolean result = bookDao.delete(bookId);
		if (result)return ResponseEntity.status(200).build(); // ResponseEntity.ok().build();
		else return ResponseEntity.status(404).build(); // ResponseEntity.notFound().build();
	}
	
	@GetMapping("/bookId/{bookId}")
	public ResponseEntity<BookDto> find(@PathVariable int bookId) {
		BookDto bookDto = bookDao.selectOne(bookId);
		boolean result = bookDto != null;
		if (result) return ResponseEntity.ok(bookDto);
		else return ResponseEntity.notFound().build(); 
	}
	
	@GetMapping("/bookTitle/{bookTitle}")
	public ResponseEntity<List<BookDto>> findTitle(@PathVariable String bookTitle) {
		List<BookDto> bookDto = bookDao.selectList(bookTitle);
		boolean result = bookDto != null;
		if (result) return ResponseEntity.ok(bookDto);
		else return ResponseEntity.notFound().build(); 
	}
	
	@PutMapping("/{bookId}")
	public ResponseEntity<String> edit(@PathVariable int bookId, @RequestBody BookDto bookDto) {
		boolean result = bookDao.edit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build() ;
	}
	
	@PatchMapping("/{bookId}")
	public ResponseEntity<String> editUnit(
			@PathVariable int bookId, @RequestBody BookDto bookDto) {
		if (bookDto.isEmpty()) return ResponseEntity.badRequest().build();
		boolean result = bookDao.editUnit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
	
		
}
