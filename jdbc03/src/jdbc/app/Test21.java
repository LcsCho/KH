package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test21 {
	public static void main(String[] args) {
		int boardNo = 21;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if (dto == null) System.out.println("없는 번호의 게시판입니다.");
		else {
			System.out.println(dto);
		}
	}
}
