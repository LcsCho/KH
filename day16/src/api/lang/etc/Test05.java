package api.lang.etc;

public class Test05 {
	public static void main(String[] args) {
		// Integer 클래스
		// = Wrapper 클래스
		// = int와 관련된 여러 기능들을 제공하는 클래스
		// = int를 객체 혀태로 사용하도록 만들어주는 클래스
		
		// 생성 - Java 9 이후부터 비추천 처리
		Integer a = new Integer(10);
		Integer b = new Integer("10");
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		Integer c = Integer.valueOf(10);
		Integer d = Integer.valueOf("10");
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
