package jdbc.app;

import java.util.List;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test15 {
	public static void main(String[] args) {

		int bookId = 21;

		BookDao dao = new BookDao();
//		BookDto dto = dao.selectOne(bookId);
		List<BookDto> list = dao.selectList();
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다");
		}
		else {
			System.out.println("총 " + list.size() + "개의 도서가 존재합니다");
			for(BookDto dto : list) {
				System.out.println(dto.getBook_title()+"($"+dto.getBook_price()+")");
			}
		}
		
//		if (dto == null) System.out.println("없는 번호의 책입니다.");
//		else System.out.println(dto);
	}
}
