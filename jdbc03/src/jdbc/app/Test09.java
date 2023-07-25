package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {
	public static void main(String[] args) {
		BookDto dto = new BookDto();
		dto.setBook_id(61);
		dto.setBook_title("이말년 시리즈");
		dto.setBook_author("이말년");
		dto.setBook_publisher("침착맨");
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);
		
		if (result) System.out.println("변경 완료");
		else System.out.println("존재하지 않는 책 번호");
	}
}
