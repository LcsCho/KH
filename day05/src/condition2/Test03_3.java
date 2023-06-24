package condition2;

public class Test03_3 {
	public static void main(String[] args) {
		
		//입력
		int age = 25;
		
		//계산 - 이용요금을 계산
		//int price = 1250 or 720 or 450 or 0;
		int price;
		if(age >= 65 || age < 9) {//어르신 또는 영유아
			price = 0;
		}
		else if(age >= 20) {//성인
			price = 1250;
		}
		else if(age >= 14) {//청소년
			price = 720;
		}
		else {//어린이
			price = 450;
		}
		
		//출력
		System.out.println("요금 : " + price + "원");
	}
}