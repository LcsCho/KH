package array3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		float[][] arr = new float[][] {{1.5f, 2.5f, 3.6f}, {10.2f, 5.3f, 6.5f}};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextFloat();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
