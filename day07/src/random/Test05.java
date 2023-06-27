package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("<구구단 게임>");
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int count = 10;
		int score = 0;
		int wrong = 0;
		
		for (int i = 0; i < count; i++) {
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			System.out.print(a + " x " + b + " = ");
			int answer = sc.nextInt();
			
			if (a * b == answer) {
				System.out.println("정답!");
				score++;
			}
			else {
				System.out.println("오답! 정답은 " + a * b);
				wrong++;
				if (wrong == 3) break;
			}
		}
		sc.close();
		System.out.println("정답 개수: " + score);
		System.out.println("오답 개수: " + wrong);
	}

}
