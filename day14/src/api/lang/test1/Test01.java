package api.lang.test1;

public class Test01 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer(10);
		StringBuffer b = new StringBuffer("hello");
		
		a.append("KH정보교육원");
		System.out.println("a.toStirng = " + a.toString());
		System.out.println("b.toString = " +b.toString());
		System.out.println("a.capacity = " + a.capacity());
		System.out.println("b.capacity = " + b.capacity());
		System.out.println("a.length = " + a.length());
		System.out.println("b.length = " + b.length());
		b.reverse();
		System.out.println("b.reverse = " + b);
	}
}
