package api.lang.string2;

import java.util.Scanner;

public class Test7_1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String memberId = null, memberPw = null, memberName = null;

		System.out.println("<회원가입을 위해 다음 정보를 입력>");
		while (true) {
			// 한 번에 아이디, 비밀번호, 닉네임에 대한 유효성을 검사하려 했으나 실제 홈페이지는 각각의 경우에 입력형식에 대한 유효성 여부를 바로 알려주기 때문에 각각 유효성을 검사하기로 코드를 짬
			if (memberId == null) {
                System.out.print("아이디(8~20자 알파벳+숫자로 구성): ");
                memberId = sc.next();
                if (!Validator.isValidId(memberId)) { // Validator 클래스에 있는 정규식(유효성 검사)을 static이기 때문에 객체 선언 없이 바로 호출 가능
                    System.out.println("아이디를 다시 입력해주세요.\n");
                    memberId = null;
                    continue;
                }
            }
			if (memberPw == null) {
                System.out.print("비밀번호(8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성): ");
                memberPw = sc.next();
                if (!Validator.isValidPw(memberPw)) {
                    System.out.println("비밀번호를 다시 입력해주세요.\n");
                    memberPw = null;
                    continue;
                }
            }
            if (memberName == null) {
                System.out.print("이름(한국인 이름): ");
                memberName = sc.next();
                if (!Validator.isValidName(memberName)) {
                    System.out.println("이름을 다시 입력해주세요.\n");
                    memberName = null;
                    continue;
                }
                else {
                	break;
                }
            }
		}
		
		// 객체에 이미 memberLevel에 대한 필터링이 존재하기 때문에 잘못된 값을 입력받아도 일반회원으로 출력되기 때문에 main에서 필터링을 하지 않았음.
		System.out.println("추가로 회원등급을 입력하고 싶으면 <y, Y> 중 하나를 눌러주세요. 원하시지 않으면 아무키나 입력해주세요.");
		String choice = sc.next();

		if (choice.equals("y") || choice.equals("Y")) {
			System.out.println("<일반회원(기본값), 우수회원, 관리자> 중 하나를 입력하세요.");
			String memberLevel = sc.next();
			sc.close();
			Member1 m = new Member1(memberId, memberPw, memberName, memberLevel);
			m.displayMemberInfo();
		}
		else { 
			Member1 m = new Member1(memberId, memberPw, memberName);
			m.displayMemberInfo();
		}
					
	}
}
