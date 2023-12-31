package api.file.multi;

public class Test01 {
	public static void main(String[] args) {
		// 멀티 바이트 입출력
		// = 원시형 데이터 및 크기가 정해진 예외적인 데이터들
		
		// Q. int를 직접 분해해서 출력한다면?
		int num = 1234567890;
		byte four = (byte) (num % 256);
		num >>= 8; // 우측으로 8칸(1byte) 밀어라
		byte three = (byte) (num % 256);
		num >>= 8; // 우측으로 8칸(1byte) 밀어라
		byte two = (byte) (num % 256);
		num >>= 8; // 우측으로 8칸(1byte) 밀어라	
		byte one = (byte) (num % 256);
		num >>= 8; // 우측으로 8칸(1byte) 밀어라	
		
		System.out.println("one = " + one);
		System.out.println("two = " + two);
		System.out.println("three = " + three);
		System.out.println("four = " + four);
	}
}
