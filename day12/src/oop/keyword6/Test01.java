package oop.keyword6;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Member m1 = new Member("adminuser", "admin1234", "관리자");
		Member m2 = new Member("student", "student1234", "수강생");
		Member m3 = new Member("manager", "manager1234", "매니저");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		System.out.print("닉네임: ");
		String nickname = sc.next();
		sc.close();
		Member m4 = new Member(id, pw, nickname);

		System.out.println("<회원 정보>");
		m1.show();
		m2.show();
		m3.show();
		m4.show();
	}


}
