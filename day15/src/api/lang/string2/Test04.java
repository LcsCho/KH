package api.lang.string2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력: ");
		String id = sc.next();
		sc.close();
		
		String regex = "^[a-z][a-z0-9\\-_]{4,19}$";
		boolean isValid = id.matches(regex);
		
		if (isValid) System.out.println("아이디를 정상적으로 입력했습니다.");
		else System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_), (-)만 사용할 수 있습니다.");
	}
}
