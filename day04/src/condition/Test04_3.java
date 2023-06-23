package condition;

public class Test04_3 {
	public static void main(String[] args) {
		//여행사 프로모션 2
		
		//입력
		int people = 2;
		int days = 1;
		int month = 7;
		
		//계산
		int price = 100000 * people * days;
		boolean summer = month == 6 || month == 7 || month == 8;
		//int discount = 0 또는 25%금액;
		int discount;
		if(summer) {
			discount = price * 25 / 100;
		}
		else {
			discount = 0;
		}
		
		int result = price - discount;
		
		
		//출력
		System.out.println("판매가 = " + result + "원");
	}
}






