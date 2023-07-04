package array;

public class Test13 {
	public static void main(String[] args) {
		int[] arr = new int[] {30, 50, 20, 10, 40};

		int left = 0;
		int right = arr.length - 1;
		
		for(int i=0; i < arr.length/2; i++) {
			int backup = arr[left];
			arr[left] = arr[right];
			arr[right] = backup;
			
			left++;
			right--;
		}
		
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
