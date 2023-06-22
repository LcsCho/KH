package condition;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 조건(Condition)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		int number = sc.nextInt();
		sc.close();
		
		if (number % 2 != 0)
			System.out.println("홀수");
		else
			System.out.println("짝수");
	}
}
