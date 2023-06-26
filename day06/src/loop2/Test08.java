package loop2;

public class Test08 {
	public static void main(String[] args) {
		long sum = 0;
		long money = 1;
		for (int i = 1; i <= 30; i++) {
			sum += money;
			System.out.println(i + "일차 금액: " + money + "원");
			money *= 2;	
		}
		System.out.println("총 받는 금액: " + sum + "원");
		
		sum = 0;
		money = 1;
		for (int i = 1; i <= 40; i++) {
			sum += money;
			money *= 2;
		}
		System.out.println("(40일차 까지) 총 받는 금액: " + money + "원");
	}
}
