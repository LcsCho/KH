package condition;

public class Test03 {
	public static void main(String[] args) {
		
		//입력
		int birth = 1955;
		int count = 1;
		
		int year = 2023;
		int price = 7500;
		
		//계산
		int age = year - birth + 1;
		
		//출력
		System.out.println("나이 : " + age + "세");
		if(age >= 65) {//어르신이면 할인
			int discount = price * count * 30 / 100;
			int result = price * count - discount;
			System.out.println("금액 : "+result+" 원");
		}
		else {//아니면 일반가격
			int result = price * count;
			System.out.println("금액 : "+result+" 원");
		}
		
	}
}