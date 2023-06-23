package data3;

public class Test05_2 {
	public static void main(String[] args) {
		//결론
		//= 30세이상 && (짝수해이면서 짝수년생 || 홀수해이면서 홀수년생)
		//= condition1 && (condition2 || condition3)
		
		//입력
		int birth = 1985;
		int year = 2023;
		
		//계산
		int age = year - birth + 1;
		boolean condition1 = age >= 30;
		
		boolean condition2a = year % 2 == 0;
		boolean condition2b = birth % 2 == 0;
		boolean condition2 = condition2a && condition2b;
		//boolean condition3 = 홀수년도이면서 홀수년생인가?;
		
		//boolean condition = condition1 && (condition2 || condition3);
		
		//출력
		System.out.println(true);
		
	}
}








