package api.lang.test1;

public class Test01 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer(10);
		StringBuffer b = new StringBuffer("hello");
		
		a.append("KH정보교육원");
		System.out.println("a요약본 = " + a.toString());
		System.out.println("b요약본 = " +b.toString());
		System.out.println("a용량 = " + a.capacity());
		System.out.println("b용량 = " + b.capacity());
		System.out.println("a글자수 = " + a.length());
		System.out.println("b글자수 = " + b.length());
		b.reverse();
		System.out.println("b글자뒤집기 = " + b);
	}
}
