package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// 숫자 모래성 게임
		// 최초에 100이라는 값을 정해두고 사용자에게 한 자리 숫자(1 ~ 9)를 입력받아 차감
		// 차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메시지를 출력
		// 몇 번만에 게임오버가 되었는지 측정하여 출력
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = 100;
		int count = 0;
		System.out.println("숫자 모래성 땅따먹기 게임!");

		
		while (true) {
			System.out.print("1에서 9사이의 숫자를 입력: ");
			int inputNum = sc.nextInt();
			
			if (inputNum >= 10) {
				System.out.println("숫자를 초과했습니다. 다시 입력하세요!");
				num += inputNum;
				count--;
			}
			num -= inputNum;
			count++;
			if (num < 0) break;
		}
		sc.close();
		System.out.println("Game Over! 총 " + count + "번 입력");	
		
//		while (true) {
//			System.out.print("1에서 9사이의 숫자를 입력: ");
//			int inputNum = r.nextInt(9) + 1;
//			System.out.println(inputNum);
//			
//			if (inputNum >= 10) {
//				System.out.println("숫자를 초과했습니다. 다시 입력하세요!");
//				num += inputNum;
//				count--;
//			}
//			num -= inputNum;
//			count++;
//			if (num < 0) break;
//		}
//		sc.close();
//		System.out.println("Game Over! 총 " + count + "번 입력");	
	}
}
