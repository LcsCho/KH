package data;

public class Test15_1 {
	public static void main(String[] args) {
		//여행사 프로모션 프로그램
		
		//입력
		int people = 3;
		int days = 7;
		
		//계산
		int price = people * days * 100000;
		
		int discount = price * 25 / 100;
		int result = price - discount;
		//int result = price * 75 / 100;
		
		//출력
		System.out.println(price);
		System.out.println(discount);
		System.out.println(result);
	}
}








