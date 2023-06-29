package array3;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		// 빙고판 만들기
		// 빙고판은 5 x 5 사이즈가 기본
		// 빙고판은 정사각형이며 홀수 크기만 가능
		// 빙고판에는 숫자가 1부터 랜덤한 위치에 배치
		// 한 칸에는 한 번의 숫자만 배치 가능
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("빙고판의 크기(홀수): ");
		
		int size = sc.nextInt();
		sc.close();
		int count = 0;
		
		int[][] bingoList = new int[size][size];
		
		for (int i = 0; i < bingoList.length; i++) {
			for (int j = 0; j < bingoList[i].length; j++) {
				count++;

				int r1 = r.nextInt(size);
				int r2 = r.nextInt(size);
				
				if (bingoList[r1][r2] == 0) {
					bingoList[r1][r2] = count;
				}
				else {
					count--;
					j--;
				}
			}
		}	
		
		for (int i = 0; i < bingoList.length; i++) {
			for (int j = 0; j < bingoList[i].length; j++) {
				System.out.print(bingoList[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
