package random;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		// 윷놀이 한 턴 구현
		// 빽도 = 1 ... 모 = default
		
		Random r = new Random();
		int yut = r.nextInt(16) + 1;
		switch(yut) {
		case 1: System.out.println("빽도"); break;
		case 2, 3, 4: System.out.println("도"); break;
		case 5, 6, 7, 8, 9, 10: System.out.println("개"); break;
		case 11,12, 13, 14: System.out.println("걸"); break;
		case 15: System.out.println("윷"); break;
		default: System.out.println("모");
		}
	}
}
