package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countAnswer = 0;
		int countWrong = 0;
		int combo = 0;
		
		System.out.print("원하는 구구단을 입력: ");
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.print(dan + " x " + i + " = ");
			int answer = sc.nextInt();
			
			if (answer == dan * i) {
				System.out.println("정답!");
				countAnswer++;
				combo++;
				System.out.println("콤보!: " + combo);
			}
			
			else {
				System.out.println("오답!");
				countWrong++;
				combo = 0;
			}
		}
		sc.close();
		System.out.println("정답: " + countAnswer + "개");
		System.out.println("정답: " + countWrong + "개");
	}
}
