package array;

import java.util.Arrays;

public class Test12 {
	public static void main(String[] args) {
		// 배열의 위치조작(변경)
		// 0번위치와 3번위치의 값을 교체(swap)
		// (중요) 자바는 두 데이터의 맞교환이 불가능(변수를 추가하여 돌리기)
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		int temp = data[0];
		data[0] = data[3];
		data[3] = temp;
		
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		
		System.out.println();
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i]);
	}
}
