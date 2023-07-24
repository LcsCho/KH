package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setMember_id("asdf12345");
		dto.setMember_pw("Test1234!");
		dto.setMember_nickname("테스트유저3");
		dto.setMember_birth("2020-01-01");
		dto.setMember_email("asdf@adsf.com");
		dto.setMember_contact("01062236781");
		dto.setMember_level("일반");
		dto.setMember_point(1500);
		
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
