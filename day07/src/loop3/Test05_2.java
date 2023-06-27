package loop3;

import java.util.Random;

public class Test05_2 {
	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;
		int coupon = 999;
		int pay = 0;
		
		while (true) {
			count++;
			pay += 1500;
			int prob = r.nextInt(10000);
			
			if (prob < 769) coupon -= 1;
			else if (prob < 1731) coupon -= 2;
			else if (prob < 2885) coupon -= 3;
			else if (prob < 4231) coupon -= 4;
			else if (prob < 5769) coupon -= 5;
			else if (prob < 7115) coupon -= 6;
			else if (prob < 8269) coupon -= 7;
			else if (prob < 9231) coupon -= 8;
			else coupon -= 9;
			
			if (coupon <= 0) break;
		}
		System.out.println("시도 횟수: " + count);
		System.out.println("총 금액: " + pay + "원");
	}
}
