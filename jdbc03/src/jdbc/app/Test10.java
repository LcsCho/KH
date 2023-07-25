package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {
	public static void main(String[] args) {
		String memberId = "asdf1234";
		String memberPw = "Testuser!1";
		String memberPwRe = "Testuser!1";

		if (memberPw.equals(memberPwRe)) {
			MemberDto dto = new MemberDto();
			dto.setMember_id(memberId);
			dto.setMember_pw(memberPw);

			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);

			if (result) System.out.println("비밀번호 변경 완료");
			else System.out.println("존재하지 않는 아이디");
		} else System.out.println("회원 변경 실패");
	}
}
