package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		/// 회원정보 수정
		
		String memberId = "";
//		String memberPw = "";
//		String memberPwRe = "";
		String memberNickname = "";
		String memberBirth = "";
		String memberEmail = "";
		String memberContact = "";
		
		MemberDto dto = new MemberDto();
//		dto.setMember_id("memerId");
		dto.setMember_id("asdf1234");
		dto.setMember_nickname("테스트유저2");
		dto.setMember_contact("01011112222");
		dto.setMember_email("asdf@naver.com");
		dto.setMember_birth("2000-01-01");
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if (result) System.out.println("회원정보 변경 완료");
		else System.out.println("회원정보 변경 실패");
	}
}
