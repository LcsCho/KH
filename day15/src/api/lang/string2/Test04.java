package api.lang.string2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력: ");
		String id = sc.next();
		sc.close();
		
		String regex = "^[a-z][_0-9a-z-]{4,19}$";
		boolean isValid = id.matches(regex);
		
		if (isValid) System.out.println("아이디를 정상적으로 입력함");
		else System.out.println("아이디를 비정상적으로 입력함");
	}
}
