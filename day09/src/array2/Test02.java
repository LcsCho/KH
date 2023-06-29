package array2;

public class Test02 {
	public static void main(String[] args) {
		// 버블정렬
		// - 인접한 두 항목을 비교하여 교체하며 정렬하는 방식
		// - 큰 데이터가 좌측에 있으면 교체, 아니면 통과

		int[] data = new int[] {10, 30, 20, 50, 40};
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 1; j < data.length; j++) {
				if (data[j - 1] > data[j]) {
					int temp = data[j - 1];
					data[j - 1] = data[j];
					data[j]= temp; 
				}			
			}
		}
		for (int i = 0; i < data.length; i++) 
			System.out.print(data[i] + " ");
		
		// 삽입정렬
		System.out.println();
		data = new int[] {10, 30, 20, 50, 40};
		
		for (int i = 1; i < data.length; i++) {
			int temp = data[i];
			int j = i - 1;
			
			while (j >= 0 && temp < data[j]) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = temp;
		}
		
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
	}
}
