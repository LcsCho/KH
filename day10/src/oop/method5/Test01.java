package oop.method5;

public class Test01 {
	public static void main(String[] args) {
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		Food f4 = new Food();
		Food f5 = new Food();
		
		f1.setup("참이슬후레쉬", "주류", 1200, true, true);
		f2.setup("클라우드맥주", "주류", 3000, false, true);
		f3.setup("바나나킥", "과자", 1500, false, true);
		f4.setup("허니버터칩", "과자", 2000, true, false);
		
		System.out.println("<온라인 쇼핑몰 상품 정보>");
		f1.show();
		f2.show();
		f3.show();
		f4.show();
	}
}
