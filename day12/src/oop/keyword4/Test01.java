package oop.keyword4;

public class Test01 {
	public static void main(String[] args) {
		Robot r = new Robot();
		
		System.out.println(r.square(11));
		System.out.println(r.triangle(3, 7));
		System.out.println(r.circle(5));
		
		// (주의) 참조형 데이터는 리모컨만 전달하면 외부에서 직접 제어 가능
		int[] arr = {10, 20, 30, 40, 50};
		r.sort(arr); // 리모컨 전달(call-by-reference)
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		r.reverseSort(arr);
		for (int i : arr) System.out.print(i + " ");
		System.out.println();
		
		r.shuffle(arr);
		for (int i : arr) System.out.print(i + " ");
	}
}
