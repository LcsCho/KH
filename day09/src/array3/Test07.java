package array3;

import java.util.Random;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("지뢰찾기 배열의 크기(홀수): ");
		
		int size = sc.nextInt();
		sc.close();
		
		int[][] mineList = new int[size][size];
		for (int i = 0; i < size + 1; i++) {
			int r1 = r.nextInt(size);
			int r2 = r.nextInt(size);
			
			if (mineList[r1][r2] == 0) mineList[r1][r2] = size;
			else 
				i--;
		}
		
		
		while (true) {
			System.out.print("숫자를 입력(행, 열)");
			
		}
		
		
//		for (int i = 0; i < mineList.length; i++) {
//			for (int j = 0; j < mineList[i].length; j++) {
//				System.out.print(mineList[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
