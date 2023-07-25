package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {
	public static void main(String[] args) {
		BookDto dto = new BookDto();
		dto.setBook_id(61);
		dto.setBook_price(24.4);
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookPrice(dto);
		
		if (result) System.out.println("변경 완료");
		else System.out.println("존재하지 않는 책 번호");
	}
}
