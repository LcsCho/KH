package condition3;

public class Test04_6 {
	public static void main(String[] args) {
		//switch로 풀이(Java 14↑) - switch expression (스위치 표현식)
		
		//입력
		int year = 2004;
		int month = 2;
		
		//계산
		//int days = 31 or 30 or 28;
		
		int days = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 4, 6, 9, 11 -> 30;
			default-> {
				boolean leap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
				if(leap) {
					yield 29;
				}
				else {
					yield 28;
				}
			}
		};
		
		//출력
		System.out.println(days+"일");
	
	}
}






