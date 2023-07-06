package api.lang.string;

public class Test03 {
	public static void main(String[] args) {
		// 문자열의 구조 / 비교 원리
		// = 자바에서 문자열은 불변(immutable)으로 관리
		
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		String d = new String("hello");
	}
}
