package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test16 {
	public static void main(String[] args) {

		int boardNo = 3;

		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectList();
		
//		BoardDto dto = dao.selectOne(boardNo);
		
		for (BoardDto dto : list) {
			System.out.print(dto);
		}
		
//		if (dto == null) System.out.println("없는 번호의 게시글입니다.");
//		else System.out.println(dto);
	}
}
