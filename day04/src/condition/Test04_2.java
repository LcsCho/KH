package condition;

public class Test04_2 {
	public static void main(String[] args) {
		//여행사 프로모션 2
		
		//입력
		int people = 2;
		int days = 1;
		int month = 7;
		
		//계산
		int price = 100000 * people * days;
		//boolean summer = 6월 또는 7월 또는 8월입니까;
		boolean summer = month == 6 || month == 7 || month == 8;
		//boolean summer = 6월 이상 8월 이하입니까;
		//boolean summer = 나누기 3 결과가 2입니까;
		
		//출력
		//if(summer == true) {
		if(summer) {
			System.out.println("할인가 = " + price * 75 / 100 + "원");
		}
		else {
			System.out.println("정상가 = " + price + "원");
		}
	}
}






