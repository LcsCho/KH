package oop.keyword4;

public class Test01 {
	public static void main(String[] args) {
		Robot r = new Robot();
		
		System.out.println(r.square(11));
		System.out.println(r.triangle(3, 7));
		System.out.println(r.circle(5));
		int[] arr = {50, 30, 20, 10, 40, 80};
		arr = r.sort(arr);
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}
