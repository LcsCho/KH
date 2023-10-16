package com.kh.spring15.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookDto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private int bookPrice;
	private String bookPublisher;
	private int bookPageCount;
	private String bookGenre;
//	private int book_id, book_price, book_page_count;
//	private String book_title, book_author, book_publisher, book_genre;
//	private String book_publication_date;
}
