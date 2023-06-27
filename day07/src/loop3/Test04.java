package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 업다운 게임
		// 1. 술래가 1부터 1000 사이의 정수 중에서 랜덤으로 하나의 숫자를 정함.
		// 2. 술래가 아닌 사람이 정답을 예측
		// 3. 예측한 정답과 실제 정답이 같으면 게임 끝
		// 4. 예측한 정답과 실제 정답이 같지 않으면 '업' 또는 '다운'을 외친다.
		
		System.out.println("업-다운 게임을 시작합니다");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int question = r.nextInt(1000) + 1;
		// System.out.println(q);
		int count = 0;
		while (true) {
			System.out.print("\n정답을 입력: ");
			int answer = sc.nextInt();
			count++;

			if (question == answer) break;
			else if (question > answer) System.out.println("틀렸습니다! 업!");
			else System.out.println("틀렸습니다! 다운!");		
		}
		sc.close();
		System.out.println("프로그램 종료, 정답까지 걸린 횟수: " + count);
	}
}
