package data3;

import java.util.Calendar;

public class Test02_1 {
	public static void main(String[] args) {
		//성인 판정 프로그램
		Calendar cal = Calendar.getInstance();
        
		//입력
		int birth = 2004;
		int year = cal.get(Calendar.YEAR);
		
		//계산
		int age = year - birth + 1;
		boolean adult = age >= 20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);
	}
}


