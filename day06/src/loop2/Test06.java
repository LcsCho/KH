package loop2;

public class Test06 {
	public static void main(String[] args) {
		// 누적 합계 구하기
		// 10을 10번 더하기
		int sum = 0;
		
		for (int i = 0; i < 10; i++)
			sum += 10;
		System.out.println("sum = " + sum);
		
		// 1부터 10까지 더하기
		sum = 0;
		for (int i = 0; i <= 10; i++)
			sum += i;
		
		System.out.println("sum = " + sum);
	}
}
