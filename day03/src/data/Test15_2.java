package data;

public class Test15_2 {
	public static void main(String[] args) {
		//여행사 프로모션 프로그램
		
		//입력
		int people = 3;
		int days = 7;
		int dayPrice = 100000;
		int rate = 25;
		
		//계산
		int price = people * days * dayPrice;
		
		int discount = price * rate / 100;
		int result = price - discount;
		//int result = price * (100-rate) / 100;//비추천(상대적으로 어려움)
		
		//출력
		System.out.println(price);
		System.out.println(discount);
		System.out.println(result);
	}
}








