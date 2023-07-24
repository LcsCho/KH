package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {
	public static void main(String[] args) {
//		String boardTitle = "테스트";
//		String boardContent = "테스트입니다.";
//		String boardWriter = "asdf1323";
		
		BoardDto dto = new BoardDto();
		dto.setBoardTitle("하이염");
		dto.setBoardContent("얼씨구");
		dto.setBoardWriter("asdfsf123");

		
		BoardDao dao = new BoardDao();
//		dao.insert(boardTitle, boardContent, boardWriter);
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
