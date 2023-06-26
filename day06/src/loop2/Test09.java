package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		// 사용자에게 숫자를 10개 입력받아서 다음을 계산
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		int sum = 0;
		double avg = 0;
		
		System.out.print("원하는 만큼의 입력할 숫자의 개수를 입력: ");
		int count = sc.nextInt();
		
		
		for (int i = 1; i <= count; i++) {
			System.out.print(i + "번 째 원하는 숫자를 입력: ");
			int num = sc.nextInt();
			if (num % 2 == 0) even++;
			else odd++;
			
			sum += num;
			avg = (double)sum / count;
		}
		
		System.out.println("\n홀수의 개수: " + odd);
		System.out.println("짝수의 개수: " + even);
		System.out.println("전체 합계: " + sum);
		System.out.println("전체 평균: " + avg);
		
		
	}
}
