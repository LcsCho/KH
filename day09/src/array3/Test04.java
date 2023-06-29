package array3;

public class Test04 {
	public static void main(String[] args) {
		String[][] arr = new String[][] {{"자바", "스프링", "안드로이드"}, {"파이썬", "판다스", "장고"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
