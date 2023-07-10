package api.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// Test04에서 자바가 감지하지 못하는 예외를 개발자가 수동으로 처리
		// -> 강제 예외처리
		
		try { // 플랜 A. 정상적으로 입력했을 때
			Scanner sc = new Scanner(System.in);
			System.out.print("금액: ");
			int money = sc.nextInt();
			if  (money < 0) { // 자바가 인식하지 못하는 문제 상황
				
			}
			
			System.out.print("인원: ");
			int people = sc.nextInt();
			if (people < 0) { // 자바가 인식하지 못하는 문제 상황
				
			}
			
			sc.close();
			int price = money / people; // 1인당 정산금액
			int remain = money % people; // 자투리 금액
			
			System.out.println("1인당 내야할 금액은 " + price + "원 입니다.");
			System.out.println(remain + "원은 저희가 지원해 드려요!");
		} 
		 catch (Exception e){ // 필살기 예외처리 
			// 플랜B. 입력을 잘못했을 때
			System.err.println("프로그램 오류 발생");
		}
	}
}
