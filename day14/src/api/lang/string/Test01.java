package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		// 문자열(String)
		
		// 생성
		String a = "hello"; // 기존 방법(클래스의 문법이 아님. 특혜)
		
		char[] ch = new char[] {'h', 'e', 'l', 'l', 'o'};
		String b = new String(ch);
		String c = new String("hello");
		
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(b);
		
		// 기능 사용
		System.out.println(a.length());
		System.out.println(b.length());
		
		// a와 b는 같나?
		System.out.println(a == b); // 동일한 객체인지 비교(비추천)
		System.out.println(a.equals(b));
	}
}
