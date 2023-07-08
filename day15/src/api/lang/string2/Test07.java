package api.lang.string2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("<다음 정보를 입력>");
			System.out.print("회원 아이디: ");
			String memberId = sc.next();
			System.out.print("회원 비밀번호: ");
			String memberPw = sc.next();
			System.out.print("회원 이름: ");
			String memberName = sc.next();
			
			String regexId = "^(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,20}$";
			String regexPw = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
			String regexName = "^[가-힣]{2,7}$";
			
			if (memberId.matches(regexId) && memberPw.matches(regexPw)&& memberName.matches(regexName)) {
				Member m = new Member(memberId, memberPw, memberName);
				System.out.println("<회원 정보>");
				System.out.println("회원 아이디: " + m.getMemberId());
				StringBuffer pwReplace = new StringBuffer(m.getMemberPw());
				pwReplace.replace(1, pwReplace.length(), "**********");
				System.out.println("회원 비밀번호: " + pwReplace);
				System.out.println("회원 이름: " + m.getMemberName());
				System.out.println("회원 레벨: " + m.getMemberLevel());
				System.out.println("회원 포인트: " + m.getMemberPoint());
				break;
			}
			else System.out.println("오류! 아이디, 비밀번호, 이름 중 잘못 입력하였습니다. 처음부터 다시 입력해주세요!");
			
		}
	}
}
