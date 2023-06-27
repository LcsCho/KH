package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		System.out.println("숫자를 입력받아 합계와 평균을 구합니다.");
		
		while (true) {
			System.out.print("숫자를 입력(0을 입력하면 종료): ");
			int num = sc.nextInt();
			if (num == 0) break;
			
			sum += num;
			count++;
		}
		sc.close();
		avg = (double) sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}
