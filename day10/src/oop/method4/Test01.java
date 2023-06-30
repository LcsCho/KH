package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		Cafe c3 = new Cafe();
		Cafe c4 = new Cafe();
		
		// 이벤트의 경우는 설정하지 않으면 안하는 걸로 할 수 있겠는가?
		// = setup의 처리방식을 2가지로 분리할 수 있는가?
		c1.setup("아메리카노", "음료", 2500, true);
		c2.setup("모카라떼", "음료", 3500);
		c3.setup("치즈케이크", "디저트", 5000, true);
		c4.setup("마카롱", "디저트", 3000);
		
		System.out.println("<커피숍 메뉴 정보>");
		
		c1.show();
		c2.show();
		c3.show();
		c4.show();
	}
}
