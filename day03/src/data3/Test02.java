package data3;

public class Test02 {
	public static void main(String[] args) {
		//성인 판정 프로그램
		
		//입력
		int birth = 2004;
		
		//계산
		int age = 2023 - birth + 1;
		boolean adult = age >= 20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);
	}
}


