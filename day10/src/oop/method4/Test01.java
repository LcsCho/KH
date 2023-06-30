package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		Cafe c3 = new Cafe();
		Cafe c4 = new Cafe();
		
		c1.setup("아메리카노", "음료", 2500, true);
		c2.setup("모카라떼", "음료", 3500, false);
		c3.setup("치즈케이크", "디저트", 5000, true);
		c4.setup("마카롱", "디저트", 3000, false);
		
		System.out.println("<커피숍 메뉴 정보>");
		
		c1.show();
		c2.show();
		c3.show();
		c4.show();
	}
}
