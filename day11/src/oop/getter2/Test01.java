package oop.getter2;

public class Test01 {
	public static void main(String[] args) {
		Grade g1 = new Grade();
		Grade g2 = new Grade();
		Grade g3 = new Grade();
		
		g1.setup("마리오", 1, 90, 80, 70);
		g2.setup("루이지", 1, 85, 85, 83);
		g3.setup("쿠파", 3, 70, 60, 55);
		
		System.out.println("<학생 성적 정보>");
		g1.show();
		g2.show();
		g3.show();
		
	}
}
