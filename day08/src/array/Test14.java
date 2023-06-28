package array;

import java.util.Random;

public class Test14 {
	public static void main(String[] args) {		
		// 1. 모든 자리는 1번씩 다른 위치와 바뀌어야 한다.
		// 2. 어디랑 섞일지 대상 위치는 모르며 같은 위치일 수도 있다.
		// 3. 랜덤으로 정해진 위치와 현재 위치의 데이터를 바꾸도록 구현
		
		int[] arr = new int[] {30, 50, 20, 10, 40};
		
		Random r = new Random();
		int count = 0;
		int countAll = 0;
		for (int i = 0; i < arr.length; i++) {
			countAll++;
			int mix = r.nextInt(5);
			if (mix == i && i >= 1) { // i가 0일 때 -1이되면 에러가 생기므로 i이가 1이상일 때만 i--를 진행하여 횟수를 늘림
				count++;
				i--; 
			}
			int temp = arr[i];
			arr[i] = arr[mix];
			arr[mix] = temp;	
		}
		System.out.println("총 횟수: " + countAll);
		System.out.println("배열위치의 중복 횟수: " + count);
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	}
}
