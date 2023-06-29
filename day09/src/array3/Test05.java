package array3;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		Random r = new Random();
		float count = 0, sum = 0;
		int[][] diceList = new int[6][5];
		
		for (int i = 0; i < diceList.length; i++) {
			System.out.print((i + 1)+ "회차 주사위 값: ");
			float eachSum = 0, eachCount = 0;
			for (int j = 0; j < diceList[i].length; j++) {
				eachCount++;
				count++;
				diceList[i][j] = r.nextInt(6) + 1;
				System.out.print(diceList[i][j] + " ");
				sum += diceList[i][j];
				eachSum += diceList[i][j];
			}
			System.out.println("\n" + (i + 1) + "회차 평균: " + eachSum / eachCount + "\n");
		}	
		System.out.println("전체회차 평균: " + sum / count);
	}
}
