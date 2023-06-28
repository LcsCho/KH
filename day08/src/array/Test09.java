package array;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] lottoList = new int[46];
		int numberCount = 0;
		int number = 0;
		
		for (int i = 0; i < 1000; i++) {
			int random = r.nextInt(45) + 1;
			lottoList[random]++;
		}
		
		for (int i = 1; i < lottoList.length; i++) {
			System.out.println(i + "번의 개수는" + lottoList[i] + "개");
				if (numberCount < lottoList[i]) {
					number = i;
					numberCount = lottoList[i];	
				}
		}
		System.out.println("가장 많이 나온 번호는: " + number + "번(" + numberCount + "개)");
			
	}
}
