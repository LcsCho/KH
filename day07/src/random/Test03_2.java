package random;

import java.util.Random;

public class Test03_2 {
	public static void main(String[] args) {
		// 윷놀이에서만 가능한 방법
		// 		윷이 4개고 윷 한 개당 경우의 수가 2가지(앞 / 뒤)
		
		Random r = new Random();
		
		int a = r.nextInt(2); // 0 or 1
		int b = r.nextInt(2); // 0 or 1
		int c = r.nextInt(2); // 0 or 1
		int d = r.nextInt(2); // 0 or 1
		int tot = a + b + c + d;
		
		switch (tot) {
		case 0: System.out.println("모"); break; // 뒤집힌 개수가 0이라면 = 모
		case 1: 
			if (a == 1) {
				System.out.println("빽도");  // 뒤집힌 개수가 1이라면 = 도/빽도
			}
			else System.out.println("도");
			break;
		case 2: System.out.println("개"); break; // 뒤집힌 개수가 2라면 = 개
		case 3: System.out.println("걸"); break;// 뒤집힌 개수가 3이라면 = 걸
		case 4: System.out.println("윷"); break; // 뒤집힌 개수가 4라면 = 윷
		}
	}
}
