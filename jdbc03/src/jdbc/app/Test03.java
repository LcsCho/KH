package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {
	public static void main(String[] args) {
		BookDto dto = new BookDto();
		dto.setBook_title("신과 함께");
		dto.setBook_author("주호민");
		dto.setBook_publication_date("2020-01-01");
		dto.setBook_price(13000);
		dto.setBook_publisher("금성");
		dto.setBook_page_count(300);
		dto.setBook_genre("소설");
		
		
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
