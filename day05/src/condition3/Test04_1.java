package condition3;

public class Test04_1 {
	public static void main(String[] args) {
		//switch로 풀이(Java 11↓)
		
		//입력
		int month = 4;
	
		//출력
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		//case 2:
		default:
			System.out.println("28일");
			break;
		}
	}
}






