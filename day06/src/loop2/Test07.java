package loop2;

public class Test07 {
	public static void main(String[] args) {
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
