package array3;

public class Test03 {
	public static void main(String[] args) {
		float[][] arr = new float[][] {{1.5f, 2.5f, 3.6f}, {10.2f, 5.3f, 6.5f}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
