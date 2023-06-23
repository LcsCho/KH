package data3;

public class Test03 {
	public static void main(String[] args) {
		//짝수 판정
		
		//입력
		int number = 17;
		
		//계산
		int mod = number % 2;
		//boolean zero = mod가 0과 같습니까?
		boolean zero = mod == 0;	
		
		//출력
		System.out.println(zero);
		
	}
}