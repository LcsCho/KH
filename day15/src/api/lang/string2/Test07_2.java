package api.lang.string2;

public class Test07_2 {
	public static void main(String[] args) {
		//회원가입 + 정규표현식 검사
		String memberId = "testuser1234";
		String memberPw = "Testuser1234!";
		String memberName = "테스트";
		
		Member2 member = new Member2(memberId, memberPw, memberName);
		member.show();
	}
}