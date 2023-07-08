package api.lang.string2;

import java.util.Scanner;

public class Test7_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("<다음 정보를 입력>");
			System.out.print("회원 아이디(8~20자 알파벳+숫자로 구성): ");
			String memberId = sc.next();
			System.out.print("회원 비밀번호(8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성): ");
			String memberPw = sc.next();
			System.out.print("회원 이름(한국인 이름): ");
			String memberName = sc.next();
			
			Member1 m = new Member1(memberId, memberPw, memberName);
	
			if (m.isValidId() && m.isValidPw()&& m.isValidName()) {
				m.showTrue();
				break;
			}
			else m.showFalse();
		}
		sc.close();
	}
}
