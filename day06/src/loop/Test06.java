package loop;

public class Test06 {
	public static void main(String[] args) {
		// 10부터 0까지 숫자가 줄어들며 출력하도록 구현
		for (int i = 10; i >= 0; i--)
			System.out.println("i = " + i);
		
		// 10분의 1씩 줄어들며 출력하는 반복문 구형
		for (int i = 12345 ; i > 0; i /= 10) {
			System.out.println("i = " + i);
			// System.out.println(i % 10);
		}
		
		// 두 배씩 늘어나는 반복문 구현
		for (int i = 1 ; i< 1000; i *= 2)
			System.out.println(i);
	}
}
