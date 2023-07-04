package oop.keyword4;

import java.util.Random;

public class Robot {
	public static int square(int a) { return a * a; }
	public static double triangle(double width, double height) { return width * height / 2; }
	public static double circle(int radius) { return radius * radius * 3.14f; }
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void reverseSort(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		
		for(int i=0; i < arr.length/2; i++) {
			int backup = arr[left];
			arr[left] = arr[right];
			arr[right] = backup;
			
			left++;
			right--;
		}
	}
	
	public static void shuffle(int arr[]) {
		Random r = new Random();
		int count = 0;
		int countAll = 0;
		for (int i = 0; i < arr.length; i++) {
			countAll++;
			int mix = r.nextInt(arr.length);
			if (mix == i && i >= 1) { // i가 0일 때 -1이되면 에러가 생기므로 i이가 1이상일 때만 i--를 진행하여 횟수를 늘림
				count++;
				i--; 
			}
			int temp = arr[i];
			arr[i] = arr[mix];
			arr[mix] = temp;	
		}
	}
}
