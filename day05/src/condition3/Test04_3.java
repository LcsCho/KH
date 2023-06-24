package condition3;

public class Test04_3 {
	public static void main(String[] args) {
		//switch로 풀이(Java 13↑)
		
		//입력
		int month = 4;
		
		//계산
		//int days = 31 or 30 or 28;
		int days;
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			days = 31;
			break;
		case 4, 6, 9, 11:
			days = 30;
			break;
		//case 2:
		default:
			days = 28;
			break;
		}
		
		//출력
		System.out.println(days+"일");
	
	}
}






