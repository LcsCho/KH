package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {
	public static void main(String[] args) {
		String memberId = "testuser1";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		// 출력
		if (dto == null) System.out.println("없는 아이디입니다.");
		else {
			System.out.println(dto);
		}
	}
}
