package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "도서 정보 객체")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class BookDto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private String bookPublisher;
	@Builder.Default
	private float bookPrice = -1f;
	private int bookPageCount;
	private String bookGenre;
}