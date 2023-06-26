package loop2;

public class Test06 {
	public static void main(String[] args) {
		// 누적 합계 구하기
		// 10을 10번 더하기
//		int sum = 0;
//		
//		for (int i = 0; i < 10; i++)
//			sum += 10;
//		System.out.println("sum = " + sum);
//		
//		// 1부터 10까지 더하기
//		sum = 0;
//		for (int i = 0; i <= 10; i++)
//			sum += i;
//		
//		System.out.println("sum = " + sum);
		int sum = 0;
		for (int i = 1; i <= 30; i++) {
			sum += 20;
		}
		int temp = sum;
		System.out.println("1번의 sum = " + sum);
		
		sum = 0;
		int count = 10;
		for (int i = 1; i <= 30; i++) {
			sum += count;
			count += 3;
		}
		System.out.println("2번의 sum = " + sum);
		System.out.println("1번과 2번의 푸시업 개수의 합계는: " + (temp + sum));
	}
}
