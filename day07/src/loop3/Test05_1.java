package loop3;

import java.util.Random;

public class Test05_1 {
	public static void main(String[] args) {
		int gold = 0;
		int lv = 0;
		int count = 0;
		Random r = new Random();
		
		while (count < 1000) {
			count++;
			gold += 1000;
			int prob = r.nextInt(10) + 1;
			if (prob == 1 || prob == 2) {
				lv++;
				if (lv == 15) break;
			}
			else if (prob == 9 || prob == 10) {
				lv--;
			}
			
			if (lv < 0) lv++;
			
		}
		
		System.out.println("예상되는 레벨: " + lv);
		System.out.println("예상되는 골드: " + gold);
	}
}
