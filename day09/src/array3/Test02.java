package array3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 2차원 배열의 생성과 사용
		int[][] score = new int[2][3];
		
		// 초기화
		score[0][1] = 15;
		score[1][0] = 20;
		score[1][2] = 40;
		
		// 출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				System.out.println(score[i][j] + " ");
			}
		}
	}
}
