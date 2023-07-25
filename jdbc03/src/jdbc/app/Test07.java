package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(4);
		dto.setBoardTitle("안녕하세염");
		dto.setBoardContent("반갑습니다");
		
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if (result) System.out.println("변경 완료");
		else System.out.println("존재하지 않는 게시판 번호");
	}
}
