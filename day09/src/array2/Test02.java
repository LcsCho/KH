package array2;

public class Test02 {
	public static void main(String[] args) {
		// 버블정렬
		// - 인접한 두 항목을 비교하여 교체하며 정렬하는 방식
		// - 큰 데이터가 좌측에 있으면 교체, 아니면 통과

		int[] data = new int[] {30, 20, 10, 40, 50};

		for(int i = data.length - 1; i > 0; i--) {
			for(int j = 0; j < i ; j++) {
				if(data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				} 
			}
		}			
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		// 삽입정렬
		data = new int[] {30, 50, 20, 10, 40};

		//정렬
		for(int i = 0; i < data.length; i++) {
			int index = i;
			int backup = data[i];
			for(int j = i-1; j >= 0; j--) {
				if(backup < data[j]) {
					index = j;
					data[j + 1] = data[j];
				}
				else {
					break;
				}
			}
			
			data[index] = backup;
		}

		//출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
