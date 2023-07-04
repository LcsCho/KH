package oop.keyword4;

public class Robot {
	public static int square(int a) { return a * a; }
	public static double triangle(double width, double height) { return width * height / 2; }
	public static double circle(int radius) { return radius * radius * 3.14f; }
	public static int[] sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
