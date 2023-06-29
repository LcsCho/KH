package array2;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		// 정렬(sort)
		// - 여러 개의 데이터를 원하는 목적에 맞게 나열하는 것
		// - 변호순, 이름순, 가격순, 랭킹순, 성적순, ...
		// - 번호순이라고 하면 번호가 낮은 것부터 나와야 한다.(오름차순)
		// - 성적순이라고 하면 성적이 높은 것부터 나와야한다.(내림차순)
		// - 정렬 방법은 여러가지가 있으며 상황에 따라 성능이 다르다.
		// - 사용자에게 데이터를 효과적으로 보여주기 위한 수단
		
		// 데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//정렬
		for(int i=0; i < data.length-1; i++) {
			//최소값 
			int min = i;
			
			for(int k=i+1; k < data.length; k++) {
				if(data[min] > data[k]) {
					min = k;
				}
			}
			
			//데이터 교체(swap)  
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		//출력
		System.out.println(Arrays.toString(data));
	}
}
