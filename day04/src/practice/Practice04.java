package practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate nowDate = LocalDate.now();
		
		System.out.print("출생년도를 입력: ");
		int birth = sc.nextInt();
		sc.close();
		
		int age = nowDate.getYear() - birth + 1;
		
		System.out.println("현재 나이: " + age);
		if (age == 19) 
			System.out.println("이벤트 대상입니다.");
		else 
			System.out.println("이벤트 대상이 아닙니다.");
	}
}
