package data;

public class Test13_1 {
	public static void main(String[] args) {
		//커피숍 문제(5+1로 풀이)
		
		//입력
		int price = 2500;
		int count = 28;
		int event = 5;
		
		//계산
		int free = count / (event+1);
		int pay = count - free;
		
		int total = price * pay;
		
		//출력
		System.out.println(free);
		System.out.println(total);
	}
}




