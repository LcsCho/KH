package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int pay = 0;
		
		System.out.print("사용자 나이를 입력: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.print("정류장 수를 입력: ");
		int count = sc.nextInt();
		
		System.out.println("<요금 결과>");
		
		if (age >= 65) {
			System.out.println("노인입니다.");
			pay = 0;
		}
		else if (age >= 20) {
			System.out.println("성인입니다.");
			pay = 1250;
		}
		else if (age >= 14) {
			System.out.println("청소년입니다.");
			pay = 720;
		}
		else if (age >= 8) {
			System.out.println("어린입니다.");
			pay = 450;
		}
		else {
			System.out.println("영유아입니다.");
			pay = 0;
		}
		
		System.out.println("카드보증금 500원을 추가합니다!");
		pay += 500;
		
		System.out.println("5정류장 당 100원씩 추가요금이 발생합니다.");
		pay += count / 5 * 100;
		
		System.out.println("최종 요금은 " + pay + "원 입니다.");
	}
}
