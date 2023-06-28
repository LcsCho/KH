package array;

public class Test13 {
	public static void main(String[] args) {
		int[] arr = new int[] {30, 50, 20, 10, 40};


		
		for (int i = 1; i <= arr.length / 2; i++) {
			int left = i;
			int right = arr.length - 1 - left;
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
