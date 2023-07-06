package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "khacademy";
		String pw = "student1234";
		
		System.out.println("아이디 입력: ");
		String inputId = sc.next();
		System.out.println("비밀번호 입력: ");
		String inputPw = sc.next();
		sc.close();
		
		if (id.equalsIgnoreCase(inputId) && pw.equals(inputPw)) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
	}
}
