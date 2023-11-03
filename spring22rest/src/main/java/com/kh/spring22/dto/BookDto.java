package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "도서")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class BookDto {
	
	@Schema(description = "책번호")
	private int bookId;
	
	@Schema(description = "책이름", example = "해리 포터")
	private String bookTitle;
	
	@Schema(description = "작가", example = "조준희")
	private String bookAuthor;
	
	@Schema(description = "출판일", example = "2023-11-03")
	private String bookPublicationDate;
	
	@Schema(description = "판매가", example = "23.23")
	private float bookPrice;
	
	@Schema(description = "출판사", example = "KH")
	private String bookPublisher;
	
	@Schema(description = "페이지수", example = "100")
	private int bookPageCount;
	
	@Schema(description = "장르", example = "의학")
	private String bookGenre;
	
	@Schema(hidden = true)
	public boolean isEmpty() {
		return bookId == 0 && bookTitle == null 
				&& bookAuthor == null && bookPublicationDate == null
				&& bookPrice == 0 && bookPublisher == null 
				&& bookPageCount == 0 && bookGenre == null;
	}
}
