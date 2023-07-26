package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {
	public static void main(String[] args) {
		int bookId = 21;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		// 출력
		if (dto == null) System.out.println("없는 번호의 책입니다.");
		else {
			System.out.println("<도서 정보>");
			System.out.println(dto);
		}
	}
}
