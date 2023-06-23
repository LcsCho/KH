package condition;

public class Test04_1 {
	public static void main(String[] args) {
		//여행사 프로모션 2
		
		//입력
		int people = 2;
		int days = 1;
		
		//계산
		int price = 100000 * people * days;
		
		//출력
		System.out.println("정상가 = " + price + "원");
		System.out.println("할인가 = " + price * 75 / 100 + "원");
	}
}






