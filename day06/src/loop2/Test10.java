package loop2;

import java.time.chrono.HijrahChronology;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class Test10 {
	public static void main(String[] args) {
		// 사용자에게 이번주 월요일부터 금요일까지 공부한 시간을 입력
		// 입력된 정보를 토대로 다음을 계산하여 출력
		
		// 1. 총 공부한 시간
		// 2. 일 평균 공부한 시간
		
		// 입력은 '시간'과 '분'을 따로 받으며, 출력도 '시간'과 '분을 따로 한다.
		
		Scanner sc = new Scanner(System.in);
		int hr = 0;
		int min = 0;
		int sum = 0;
		double avg = 5;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("시간: ");
			hr = sc.nextInt();
			
			System.out.print("분: ");
			min = sc.nextInt();
			
			sum += 60 * hr + min;
			
		}
		avg = sum / avg;
		
		
		System.out.println("\n총 공부한 시간은 " + (sum / 60) + "시간 " + (sum % 60) + "분");
		System.out.println("일 평균 약 " + (int)(avg / 60) + "시간 " + (double)(avg % 60) + "분");
	}
}
