package condition;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("속도를 입력: ");
		int speed = sc.nextInt();
	
		sc.close();
		
		int fine = 0;
		int count = 10;
		
		if (speed > 50) {
			fine = 30000;
			if ((speed - 50) / count >= 1)
				fine += 10000 * ((speed - 50) / count);
		}
		System.out.println("벌금은 " + fine + "원 입니다.");
	}
}
