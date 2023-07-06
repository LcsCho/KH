package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "khacademy";
		String pw = "student1234";

		System.out.print("아이디 입력: ");
		String inputId = sc.next();
		System.out.print("비밀번호 입력: ");
		String inputPw = sc.next();
		sc.close();
		
		boolean isLogin = id.equalsIgnoreCase(inputId) && pw.equals(inputPw);
		if (isLogin) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
	}
}
