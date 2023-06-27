package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		// 모두의 마블
		Random r = new Random();
		
		int countDouble = 0;
		int count = 100;
		int real = 0;
		
		for (int i = 0; i < count; i++) {
			real++;
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;
			
			if (dice1 == dice2) {
				// System.out.println("더블!");
				i--;
				countDouble++;
			}
		}
		// System.out.println(count);
		System.out.println("더블이 나온 횟수: " + countDouble);
		System.out.println("더블이 나올 확률: " + (double)countDouble / real * 100 + "%");
	}
}
