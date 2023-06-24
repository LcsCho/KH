package condition3;

public class Test04_2 {
	public static void main(String[] args) {
		//switch로 풀이(Java 13↑)
		
		//입력
		int month = 4;
	
		//출력
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일");
			break;
		//case 2:
		default:
			System.out.println("28일");
			break;
		}
	}
}






