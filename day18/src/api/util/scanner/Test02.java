package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// .next() 계열의 명령어 뒤에 .nextLine()을 쓸 경우 비어있는 명령 한 개 필요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String a = sc.next();
		
		System.out.print("입력: ");
		sc.nextLine();
		String b = sc.nextLine(); // 엔터 처리용 명령
		
		sc.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
